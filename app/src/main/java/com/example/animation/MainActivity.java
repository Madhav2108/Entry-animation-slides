package com.example.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    TextView text1;
    Button pre,next;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Techniques[] tech= Techniques.values();

        //finding id's
        text1=findViewById(R.id.text);
        pre=findViewById(R.id.pre);
        next=findViewById(R.id.next);


        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                YoYo.with(tech[i]).playOn(text1);
                if(i<tech.length-1)
                i++;
            }
        });
        //next button listener
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(tech[i]).playOn(text1);
                if(i!=0)
                    i--;
            }
        });

    }
}
