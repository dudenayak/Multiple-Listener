package com.example.mutiplelistenerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mybtn=findViewById(R.id.btn);
        final EditText editText=findViewById(R.id.edt);

        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txtview=findViewById(R.id.txt);
//                txtview.setText("Button Clicked");
                double amt=Double.parseDouble(editText.getText().toString());
                amt=amt*71;
                txtview.setText(amt+"This the amount in rupee");
            }
        });

        mybtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                TextView mytxt=findViewById(R.id.txt);
                mytxt.setText("Long button clicked");
                return true;
            }
        });
    }
}
