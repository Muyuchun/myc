package com.example.coursetable;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;


public class MainActivity extends Activity {
    private GridView gvDate, gvContent;
    private ListView lvNum;
    private MySchedule mySchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        //因为重叠，所以可以通过GridView的ItemClick获取当前位置信息，这里传的是position，具体的计算工作交给MySchedule
        gvContent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                openAlter(position);
            }
        });
    }

    private void init() {
        gvDate = (GridView) findViewById(R.id.gvDate);
        gvDate.setAdapter(new GvDateAdapter(MainActivity.this));

        lvNum = (ListView) findViewById(R.id.lvNum);
        lvNum.setAdapter(new LvNumAdapter(MainActivity.this));

        gvContent = (GridView) findViewById(R.id.gvContent);
        gvContent.setAdapter(new GvContentAdapter(MainActivity.this));

        mySchedule = (MySchedule) findViewById(R.id.mySchedule);
    }

    //添加组件的dialog
    private void openAlter(final int position) {
        final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.show();
        alertDialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE | WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM);
        alertDialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        Window window = alertDialog.getWindow();
        window.setContentView(R.layout.dialog);
        final EditText etName = (EditText) window.findViewById(R.id.etName);
        final EditText etNum = (EditText) window.findViewById(R.id.etNum);
        Button btnSuer = (Button) window.findViewById(R.id.btnSure);
        Button btnCancel = (Button) window.findViewById(R.id.btnCancel);

        btnSuer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(etName.getText().toString()) && !TextUtils.isEmpty(etNum.getText().toString())) {
                    int num = Integer.valueOf(etNum.getText().toString());
                    if (num <= 12 && num > 0) {
                        Coordinate coordinate = new Coordinate(position, num, etName.getText().toString());
                        //此时是新添加View，所以要先添加进列表，然后显示，最后还要进行数据的保存工作，这些全部在addToList中完成了
                        mySchedule.addToList(coordinate);
                        alertDialog.dismiss();
                    }
                }
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
    }
}