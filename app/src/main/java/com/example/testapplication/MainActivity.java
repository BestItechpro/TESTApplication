package com.example.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private EditText num1,num2;
    private TextView Result;
    private Button btn1;
    private int res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            num1=findViewById(R.id.editText);
            num2=findViewById(R.id.editText1);
            Result=findViewById(R.id.textView);
            btn1=findViewById(R.id.button);

btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        double n1=Double.parseDouble(num1.getText().toString());
        double n2=Double.parseDouble(num2.getText().toString());
        Result.setText("Addition:" + Double.toString(n1+n2)+"\nSubstraction:"+Double.toString(n1-n2)+"\nMultiplication:"+Double.toString(n1*n2)+"\nDivision:"+Double.toString(n1/n2));
    }
});

    }
}
