package com.example.someapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;
    ImageView iv;
    boolean show =false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btnfirst);
        tv=findViewById(R.id.txt);
        iv=findViewById(R.id.img);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show){
                    tv.setVisibility(View.INVISIBLE);
                    iv.setVisibility(View.INVISIBLE);
                }
                else{
                    tv.setVisibility(View.VISIBLE);
                    iv.setVisibility(View.VISIBLE);

                }

            }
        });




    }
}
