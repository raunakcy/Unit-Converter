package com.example.unitconverterapp;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView txtTitle,txtAns;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtAns = findViewById(R.id.txtAns);
        txtTitle = findViewById(R.id.txtTitle);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = editText.getText().toString();
                double kilos = Double.parseDouble(number);
              double pounds = converter(kilos);

                txtAns.setText("" +pounds);



            }
        });
    }

    public double converter(double a){

        return a * 2.205;
    }

}