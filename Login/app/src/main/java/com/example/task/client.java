package com.example.task;

import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.Executors;

public class client extends Thread{
    public String ipString = "127.0.0.1";   // 服务器端ip
    public int port = 12345;                // 服务器端口
    public Socket socket;
    public String Mode;
    public TextView statusView;
    public client(String ipString, int port, String Mode, TextView statusView)
    {
        if (ipString != null) this.ipString = ipString;
        if (port >= 0) this.port = port;
        this.Mode = Mode;
        this.statusView = statusView;
    }
    public void start()
    {
        if (socket != null && socket.isConnected()) return;

        Executors.newCachedThreadPool().execute(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    if (socket == null)
                    {
                        InetAddress ip = InetAddress.getByName(ipString);
                        socket = new Socket(ip, port);
                        //收到服务器返回消息

                    }
                }
                catch (Exception ex)
                {
                    Log.e(client.class.getName(),"连接出现问题"+ ex.toString()); // 连接失败
                }

                // Socket接收数据
                try
                {
                    if (socket != null)
                    {
                        BufferedReader in = new BufferedReader(new InputStreamReader(socket
                                .getInputStream()));
                        while (socket.isConnected())
                        {
                            String data = in.readLine();

                            if(Mode.equals("Reg")){
                                if (data.contains(Constants.Success)) {
                                    statusView.setText("注册成功");
                                }else if(data.contains(Constants.Failed)){
                                    int index = getIndex(data);
                                    if(index != -1){
                                        statusView.setText("注册失败" + data.substring(index + 1));
                                    }
                                }
                            }else if(Mode.equals("Login")){
                                if (data.contains(Constants.Success)) {
                                    statusView.setText("验证成功");
                                }else if(data.contains(Constants.Failed)){
                                    int index = getIndex(data);
                                    if(index != -1){
                                        statusView.setText("验证失败" + data.substring(index + 1));
                                    }
                                }
                            }else {

                            }
                        }

                    }
                }
                catch (Exception ex)
                {
                    Log.e(client.class.getName(),"接收socket信息失败"); // 连接失败
                    socket = null;
                }
            }
        });

    }

    /** 发送信息 */
    public void Send(String data)
    {
        try
        {
            if(socket != null && socket.isConnected())
            {
                PrintWriter out = new PrintWriter(socket.getOutputStream());
                out.println(data);
                out.flush();
            }
            else
            {
                Log.e(client.class.getName(),"建立socket失败");
            }
        }
        catch (Exception ex)
        {
            Log.e(client.class.getName(),"发送socket信息失败！");
        }
    }

    /** 断开Socket */
    public void disconnect()
    {
        try
        {
            if (socket != null && socket.isConnected())
            {
                socket.close();
                socket = null;

                Log.e(client.class.getName(),"服务器已断开！ ");
            }
        }
        catch (Exception ex)
        {
            Log.e(client.class.getName(),"断开socket失败!");
        }
    }
    private int getIndex(String msg) {
        for(int i = 0;i<msg.length();i++) {
            if(msg.charAt(i) == '|') {
                return i;
            }
        }
        return -1;
    }
}
