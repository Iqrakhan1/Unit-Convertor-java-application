package com.example.unitconvertorapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
 private Button button;
 private TextView textview;
 private EditText editText;
   

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
         textview = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(MainActivity.this, "Conversion Done", Toast.LENGTH_SHORT).show();
               String s = editText.getText().toString();
               int KG = Integer.parseInt(s);
               double Pound = 2.205 * KG;
               textview.setText(" The corresponding value in pound is " + Pound);
             }
         });
    }
}