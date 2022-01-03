package com.example.koreambti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Friend extends AppCompatActivity {
    int num = 0;
    Button button2;
    TextView fontView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);

        String var1 = ((Myresult)Myresult.context_myresult).var1;
        String var2 = ((Friendresult)Friendresult.context_friendresult).var2;
        String name1 = ((Myresult)Myresult.context_myresult).name1;
        String name2 = ((Friendresult)Friendresult.context_friendresult).name2;
        String data1 = ((Test4Activity)Test4Activity.context_test4activity).data1;
        String data2 = ((Testfriend4)Testfriend4.context_testfriend4).data2;
        String [] arr1 = var1.split("");
        String [] arr2 = var2.split("");
        fontView2 = (TextView)findViewById(R.id.fontView2);
        if(arr1[0].equals(arr2[0]))
            num++;
        if(arr1[1].equals(arr2[1]))
            num++;
        if(arr1[2].equals(arr2[2]))
            num++;
        if(arr1[3].equals(arr2[3]))
            num++;
            if(num==0)
            { Log.d(this.getClass().getName(),
                        (String)fontView2.getText());
            fontView2.setText((name1+" 님과 "+name2+" 님은 "+"\n\n아는 사람인가요?")); }
            else if(num==1)
            { Log.d(this.getClass().getName(),
                        (String)fontView2.getText());
            fontView2.setText((name1+" 님과 "+name2+" 님은 "+"\n\n지인이네요!")); }
            else if(num==2)
            {Log.d(this.getClass().getName(),
                        (String)fontView2.getText());
            fontView2.setText((name1+" 님과 "+name2+" 님은 "+"\n\n친한 사이군요!")); }
            else if(num==3)
            {Log.d(this.getClass().getName(),
                    (String)fontView2.getText());
            fontView2.setText((name1+" 님과 "+name2+" 님은 "+"\n\n영혼의 단짝이네요!")); }
            else
            {Log.d(this.getClass().getName(),
                        (String)fontView2.getText());
                fontView2.setText(name1+" 과 "+name2+" 는 "+"\n\n결혼해도 되겠어요!"); }
            


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"처음으로 돌아갑니다.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Friend.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}