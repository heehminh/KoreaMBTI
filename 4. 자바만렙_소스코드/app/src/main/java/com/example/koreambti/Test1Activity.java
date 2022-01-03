package com.example.koreambti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Test1Activity extends AppCompatActivity {

    TextView textView1, textView2, fontView3, textResult;
    ImageView imageView1;
    Button button1, button2;
    private String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        Intent intent = getIntent();
        userName = intent.getStringExtra("name");

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        fontView3 = findViewById(R.id.fontView3);
        imageView1 = findViewById(R.id.imageView1);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        // Myresult창에 나올 데이터를 저장
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"짜장면을 선택했습니다.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Test1Activity.this, Test2Activity.class);
                intent.putExtra("data", "짜");
                intent.putExtra("name", userName);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"짬뽕을 선택했습니다.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Test1Activity.this, Test2Activity.class);
                intent.putExtra("data", "짬");
                intent.putExtra("name", userName);
                startActivity(intent);
            }
        });

    }
}