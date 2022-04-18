package com.example.stockaverage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private Button button;
   private EditText oldShare;
   private EditText price1;
   private TextView oldInvestment;
    private EditText newShare;
    private EditText newPrice;
    private TextView newInvestment;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;




    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        oldShare = findViewById(R.id.oldShare);
        price1 = findViewById(R.id.price1);
        oldInvestment = findViewById(R.id.oldInvestment);
        newShare = findViewById(R.id.newShare);
        newPrice = findViewById(R.id.newPrice);
        newInvestment = findViewById(R.id.newInvestment);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);


        getSupportActionBar().hide();



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (oldShare.getText().toString().isEmpty() || price1.getText().toString().isEmpty()
                ||newShare.getText().toString().isEmpty()||newPrice.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter the Details", Toast.LENGTH_SHORT).show();
                }else {


                    String s = oldShare.getText().toString();
                    float share = Integer.parseInt(s);

                    String r = price1.getText().toString();
                    float price = Integer.parseInt(r);
                    float total = share * price;
                    oldInvestment.setText("Investment: " + total);


                    String a = newShare.getText().toString();
                    float Nshare = Integer.parseInt(a);
                    String b = newPrice.getText().toString();
                    float Nprice = Integer.parseInt(b);
                    float Ntotal = Nshare * Nprice;
                    newInvestment.setText("Investment Is " + Ntotal);


                    String c = oldShare.getText().toString();
                    float ab = Integer.parseInt(c);
                    String d = newShare.getText().toString();
                    float cd = Integer.parseInt(d);
                    float Tinvestment = (share * price) + (Nshare * Nprice);
                    textView7.setText("Investment Is : " + Tinvestment);


                    float TotalShare = ab + cd;
                    textView8.setText("Total Share : " + TotalShare);

                    float average = Tinvestment / TotalShare;
                    textView9.setText("Average Is : " + average);
                }

            }

            
        });





    }
}