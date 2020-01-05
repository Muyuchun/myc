package com.example.task;
import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivity extends Activity implements View.OnClickListener{

    private EditText accountEdit = null;
    private EditText pwdEdit = null;
    private Button btn_Cancel = null;
    private Button btn_Login = null;
    private TextView StatusView = null;
    private CheckBox cb = null;
    private ImageButton qq1 = null;
    private ImageButton wechat1 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //绑定id
        accountEdit = (EditText)findViewById(R.id.accountEdit);
        pwdEdit = (EditText)findViewById(R.id.PwdEdit);
        btn_Cancel = (Button)findViewById(R.id.Register);
        btn_Login = (Button)findViewById(R.id.login);
        StatusView = (TextView)findViewById(R.id.statusView);
        cb = (CheckBox)findViewById(R.id.cb);
        qq1 = (ImageButton)findViewById(R.id.qq);
        wechat1 = (ImageButton)findViewById(R.id.wechat);
        //监听
        btn_Login.setOnClickListener(this);
        btn_Cancel.setOnClickListener(this);
        qq1.setOnClickListener(this);
        wechat1.setOnClickListener(this);
    }


    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.Register:
                StatusView.setText("Bye Bye！");
                Intent intent1 = new Intent(MainActivity.this,Third.class);
                startActivity(intent1);
                break;
            case R.id.login:
                if(cb.isChecked()) {
                    if(!TextUtils.isEmpty(accountEdit.getText())) {
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                 client c = new client(null,-1,"Login",StatusView);
                                 c.start();
                                c.Send(Constants.LoginRequest + accountEdit.getText() + "###" + pwdEdit.getText());
                            }
                        }).start();
                        while(!StatusView.getText().equals("验证成功")){
                            StatusView.setText("服务器查验中。。。");
                        }
                        StatusView.setText("Account:" + accountEdit.getText() + "登陆成功！");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Intent intent = new Intent(MainActivity.this, Second.class);
                        intent.putExtra("name",accountEdit.getText().toString());
                        //创建好之后就可以通过它启动新的Activity
                        startActivityForResult(intent,1000);
                    }else{
                        StatusView.setText("账号不能为空！");
                    }
                }else{
                    StatusView.setText("请勾选同意用户条例！");
                }
                break;
            case R.id.qq:
                Intent i1 = new Intent(MainActivity.this,qq.class);
                startActivityForResult(i1,1000);
                break;
            case R.id.wechat:
                Intent i2 = new Intent(MainActivity.this,wechat.class);
                startActivityForResult(i2,1000);
                break;
        }
    }
}
