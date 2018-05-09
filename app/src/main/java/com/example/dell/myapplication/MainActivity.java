package com.example.dell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newpage();
    }

    public void newpage()
    {
        start =(Button) findViewById(R.id.sta);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(MainActivity.this, Main2Activity.class);
                Toast.makeText(MainActivity.this,"Start",Toast.LENGTH_SHORT).show();
                startActivity(k);
                finish();
            }
        });
    }
}
