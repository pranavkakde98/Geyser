package com.example.pranav.geyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Geyser2 extends AppCompatActivity {
    private RadioButton radioButton;
    private RadioButton radioButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geyser2);
        radioButton=(RadioButton) findViewById(R.id.y2);
        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p3();
            }

        });
        radioButton1=(RadioButton) findViewById(R.id.y5);
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p4();
            }

        });
    }

    private void p4() {
        Intent intent=new Intent(this,Geyser4.class);
        startActivity(intent);
    }

    private void p3() {
        Intent intent=new Intent(this,Geyser3.class);
        startActivity(intent);


    }
}
