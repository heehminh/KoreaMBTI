package com.example.koreambti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Myresult extends AppCompatActivity {

   TextView fontView1,fontView2, fontView3, TextView1, TextView2;
   Button button1, button2;
    public static Context context_myresult; // context 변수 선언
    public String var1,name1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myresult);
        context_myresult = this;

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
        button2 = findViewById(R.id.button2);

        fontView2.setText(name);
        fontView3.setText(data);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"처음으로 돌아갑니다.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Myresult.this, MainActivity.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Myresult.this, Friendname.class);
                startActivity(intent);

            }
        });
        var1 = data;
        name1 = name;



    }
}