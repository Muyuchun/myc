package com.example.coursetable;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Environment;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Random;

public class MySchedule extends ViewGroup {
    private Context context;
    private ArrayList<Coordinate> list;
    //这个是存储路径，开发者可以自己定义
    private static final String file_path = "/schedule.txt";

    public MySchedule(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        list = new ArrayList<>();
    }

    //根据List中存储的课程信息，依次添加TextView
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int childNum = getChildCount();
        for (int i = 0; i < childNum; i++) {
            View child = getChildAt(i);

            Coordinate child_coordinate = list.get(i);
            int position = child_coordinate.getPosition();
            //position是从0开始的
            //这个计算的是第几行和第几列，因为一周固定7天，所以这里直接使用了7
            int line = position / 7;
            int vertical = position % 7;

            //每个课程最小单元格的宽度和高度，注意，这里布局中的GridView和ListView是去除了Divider的
            int item_width = getMeasuredWidth() / 7;
            int item_height = getMeasuredHeight() / 12;
            //给子View计算位置坐标，分别是左上角和右下角的坐标
            int left = vertical * item_width;
            int top = line * item_height;
            int right = (vertical + 1) * item_width;
            int bottom = (line + child_coordinate.getClassNum()) * item_height;
            child.layout(left + 5, top + 5, right - 5, bottom - 5);
        }
    }

    //外部调用的、用于添加组件（课程）的方法
    public void addToList(Coordinate coordinate) {
        list.add(coordinate);
        addView(coordinate);
    }

    //添加视图
//    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void addView(final Coordinate coordinate) {
        TextView tv = new TextView(context);
        tv.setText(coordinate.getClassName());
        tv.setBackgroundColor(randomColor());
        tv.setGravity(Gravity.CENTER);
        tv.setTextColor(Color.parseColor("#ffffff"));
        tv.setAlpha(0.80f);
//        tv.setElevation(5);
        tv.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlter(coordinate.getPosition(), coordinate.getClassName());
            }
        });
        addView(tv);
    }

    //移除视图
    private void removeView(int position) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPosition() == position) {
                list.remove(i);
                removeView(getChildAt(i));
            }
        }
    }

    //随机生成颜色
    private int randomColor() {
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

    //编辑dialog，开发者可以自行添加一些方法，比如修改
    private void openAlter(final int position, String text) {
        final AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.show();
        alertDialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE | WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM);
        alertDialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        Window window = alertDialog.getWindow();
        window.setContentView(R.layout.dialog_edit);
        TextView tvContent = (TextView) window.findViewById(R.id.tvContent);
        tvContent.setText(text);
        Button btnDele = (Button) window.findViewById(R.id.btnDele);
        Button btnClose = (Button) window.findViewById(R.id.btnClose);

        btnDele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeView(position);
                alertDialog.dismiss();
            }
        });
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
    }

    //Json文件的生成
    private JSONObject dataCreate(ArrayList<Coordinate> coordinates) {
        JSONObject jsonObject = new JSONObject();
        try {
            JSONArray jsonArray = new JSONArray();
            for (int i = 0; i < coordinates.size(); i++) {
                JSONObject object = new JSONObject();
                object.put("position", coordinates.get(i).getPosition());
                object.put("classNum", coordinates.get(i).getClassNum());
                object.put("className", coordinates.get(i).getClassName());
                jsonArray.put(i, object);
            }
            jsonObject.put("coordinate", jsonArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    //Json文件的解析
    private void dataParse(String data) {
        try {
            JSONObject jsonObject = new JSONObject(data);
            JSONArray jsonArray = jsonObject.optJSONArray("coordinate");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject object = (JSONObject) jsonArray.optJSONObject(i);
                Coordinate coordinate = new Coordinate(
                        object.optInt("position"),
                        object.optInt("classNum"),
                        object.optString("className")
                );
                list.add(coordinate);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
