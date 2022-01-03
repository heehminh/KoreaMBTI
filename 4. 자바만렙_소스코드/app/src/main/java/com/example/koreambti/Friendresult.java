package com.example.koreambti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Friendresult extends AppCompatActivity {

    TextView fontView1,fontView2, fontView3, TextView1, TextView2;
    Button button1;
    public static Context context_friendresult;  // context 변수 선언
    public String var2,name2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendresult);
        context_friendresult = this;

        Intent intent = getIntent();
        // user 닉네임
        String name = intent.getExtras().getString("name");
        // 이전 액티비티로부터 얻은 결과 값 (최종)
        String data = intent.getExtras().getString("data");

        fontView1 = (TextView) findViewById(R.id.fontView1);
        fontView2 = (TextView) findViewById(R.id.fontView2);
        fontView3 = (TextView) findViewById(R.id.fontView3);
        TextView1 = (TextView) findViewById(R.id.TextView1);
        TextView2 = (TextView) findViewById(R.id.TextView2);
        button1 = findViewById(R.id.button1);

        fontView2.setText(name);
        fontView3.setText(data);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Friendresult.this, Friend.class);
                startActivity(intent);

            }
        });
        var2 = data;
        name2 = name;
    }
}