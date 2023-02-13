package com.abedkhan.audiovideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class openscreen extends AppCompatActivity {

    ProgressBar progressBar;
    int count =2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openscreen);

        progressBar=findViewById(R.id.progressbar);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressBar.setProgress(count);
                Intent splashintent=new Intent(openscreen.this,MainActivity.class);
                startActivity(splashintent);
                finish();

            }
        },count);




    }
}