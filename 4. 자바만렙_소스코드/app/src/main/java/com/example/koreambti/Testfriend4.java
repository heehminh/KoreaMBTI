package com.example.koreambti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Testfriend4 extends AppCompatActivity {

    TextView textView1, textView2, fontView3;
    ImageView imageView1;
    Button button1, button2;

    // 이전 액티비티로부터 얻은 결과 값
    private String fromResult, userName;
    public static Context context_testfriend4; // context 변수 선언
    public String data2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testfriend4);
        context_testfriend4 = this;

        Intent intent = getIntent();
        fromResult = intent.getStringExtra("data");
        userName = intent.getStringExtra("name");

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        fontView3 = findViewById(R.id.fontView3);
        imageView1 = findViewById(R.id.imageView1);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"쌀떡을 선택했습니다.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Testfriend4.this, Friendresult.class);
                intent.putExtra("data", fromResult + "쌀");
                intent.putExtra("name", userName);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"밀떡을 선택했습니다.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Testfriend4.this,Friendresult.class);
                intent.putExtra("data", fromResult + "밀");
                intent.putExtra("name", userName);
                startActivity(intent);
            }
        });
        data2 = fromResult;

    }
}