package com.example.stockaverage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashedScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashed_screen);

        Thread thread= new Thread(){
            public void run(){
                try {
                    sleep(1500);
                }
                catch (Exception e){
                    e.printStackTrace();
            }
                finally {
                    Intent intent = new Intent(SplashedScreen.this , MainActivity.class);
                    startActivity(intent);
                    finish();

                }
                }

        };thread.start();
        getSupportActionBar().hide();

    }
}