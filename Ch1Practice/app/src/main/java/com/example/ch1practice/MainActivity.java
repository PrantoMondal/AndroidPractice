package com.example.ch1practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.PrintStream;

public class MainActivity extends AppCompatActivity {
    TextView text;
    EditText n1;
    int n,result;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Good Morning", Toast.LENGTH_SHORT).show();
        text = findViewById(R.id.text);
        n1 = findViewById(R.id.n1);
//        n2 = findViewById(R.id.n2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (n = 1;n<=10;n++) {
                    int result = Integer.parseInt(n1.getText().toString()) * n;
                }
                text.setText(Integer.parseInt(n1.getText().toString()) +"*"+n + "=" + result + "\n");
            }
        });


    }
}