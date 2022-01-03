package com.example.koreambti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Friendname extends AppCompatActivity {
    TextView fontView1, fontView2, fontView4;
    EditText EditText1;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendname);
        fontView1 = findViewById(R.id.fontView1);
        fontView2 = findViewById(R.id.fontView2);
        EditText1 = findViewById(R.id.EditText1);
        fontView4 = findViewById(R.id.fontView4);
        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // 이름 저장
                Intent intent = new Intent(Friendname.this, Testfriend1.class);
                intent.putExtra("name",EditText1.getText().toString());
                startActivity(intent);
            }
        });
    }
}