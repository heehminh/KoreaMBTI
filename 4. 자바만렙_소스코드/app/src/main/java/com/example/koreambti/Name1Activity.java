package com.example.koreambti;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Name1Activity extends AppCompatActivity {

    TextView fontView1, fontView2, fontView3;
    EditText EditText1;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name1);

        fontView1 = findViewById(R.id.fontView1);
        fontView2 = findViewById(R.id.fontView2);
        EditText1 = findViewById(R.id.EditText1);
        fontView3 = findViewById(R.id.fontView3);
        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // 이름 저장
                Intent intent = new Intent(Name1Activity.this, Test1Activity.class);
                intent.putExtra("name",EditText1.getText().toString());
                startActivity(intent);
            }
        });

    }
}
