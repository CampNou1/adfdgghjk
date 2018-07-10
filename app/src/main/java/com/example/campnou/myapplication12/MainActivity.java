package com.example.campnou.myapplication12;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView3;
    private Button login_btn;
    private TextView textView;
    private TextView textView1;
    private EditText snum_text;
    private EditText spasw_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        textView3 = (TextView) findViewById(R.id.textView3);
        login_btn = (Button) findViewById(R.id.login_btn);
        textView = (TextView) findViewById(R.id.textView);
        textView1 = (TextView) findViewById(R.id.textView1);
        snum_text = (EditText) findViewById(R.id.snum_text);
        spasw_text = (EditText) findViewById(R.id.spasw_text);
        login_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_btn:
                submit();
                break;
        }
    }

    private void submit() {
        // validate
        String username = snum_text.getText().toString().trim();
        if (TextUtils.isEmpty(username)) {
            Toast.makeText(this, "用户名不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String pwd = spasw_text.getText().toString().trim();
        if (TextUtils.isEmpty(pwd)) {
            Toast.makeText(this, "密码不能为空", Toast.LENGTH_SHORT).show();
            return;
        }
        else {
            Intent intent = new Intent(MainActivity.this,ManageActivity.class);
            startActivity(intent);
            Log.d("1", "submit:1111 ");
        }

        // TODO validate success, do something


    }
}
