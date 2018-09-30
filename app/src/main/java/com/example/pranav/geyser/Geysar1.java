package com.example.pranav.geyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Geysar1 extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geysar1);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    private void u2() {
        Intent intent=new Intent(this,Geyser2.class);
        startActivity(intent);

    }

    @Override
    public void onClick(View v) {
        u2();

    }
}
