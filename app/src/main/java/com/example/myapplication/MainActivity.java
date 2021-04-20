package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnClr;
    private Button btnEql;
    private Button btnAdd;
    private Button btnSub;
    private Button btnMul;
    private Button btnDiv;
    private TextView textViewResult;
    private TextView textViewControl;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char eql = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;

    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     alpha();

        btn1.setOnClickListener(new  View.OnClickListener() {
         @Override
         public void onClick(View v) {
        textViewControl.setText(textViewControl.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewControl.setText(textViewControl.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewControl.setText(textViewControl.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewControl.setText(textViewControl.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewControl.setText(textViewControl.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewControl.setText(textViewControl.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewControl.setText(textViewControl.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewControl.setText(textViewControl.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewControl.setText(textViewControl.getText().toString() + "9");
            }
        });
        btn0.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewControl.setText(textViewControl.getText().toString() + "0");
            }
        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textViewControl.getText().length() > 0){
                    CharSequence name = textViewControl.getText().toString();
                    textViewControl.setText(name.subSequence(0, name.length()-1));
                }
                else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    textViewControl.setText(null);
                    textViewResult.setText(null);
                }
            }
        });
        btnEql.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beeta();
                ACTION = eql;
                textViewResult.setText(textViewResult.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                textViewControl.setText(null);
            }
        });
        btnAdd.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beeta();
                ACTION = ADDITION;
                textViewResult.setText(String.valueOf(val1)+ "+");
                textViewControl.setText(null);
            }
        });
        btnSub.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beeta();
                ACTION = SUBTRACTION;
                textViewResult.setText(String.valueOf(val1)+ "-");
                textViewControl.setText(null);
            }
        });
        btnMul.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beeta();
                ACTION = MULTIPLICATION;
                textViewResult.setText(String.valueOf(val1)+ "*");
                textViewControl.setText(null);
            }
        });
        btnDiv.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beeta();
                ACTION = DIVISION;
                textViewResult.setText(String.valueOf(val1)+ "/");
                textViewControl.setText(null);
            }
        });






    }

private void alpha() {
    btn1 = (Button) findViewById(R.id.btn1);
    btn2 = (Button) findViewById(R.id.btn2);
    btn3 = (Button) findViewById(R.id.btn3);
    btn4 = (Button) findViewById(R.id.btn4);
    btn5 = (Button) findViewById(R.id.btn5);
    btn6 = (Button) findViewById(R.id.btn6);
    btn7 = (Button) findViewById(R.id.btn7);
    btn8 = (Button) findViewById(R.id.btn8);
    btn9 = (Button) findViewById(R.id.btn9);
    btn0 = (Button) findViewById(R.id.btn0);
    btnEql = (Button) findViewById(R.id.btnEql);
    btnClr = (Button) findViewById(R.id.btnClr);
    btnAdd = (Button) findViewById(R.id.btnAdd);
    btnSub = (Button) findViewById(R.id.btnSub);
    btnMul = (Button) findViewById(R.id.btnMul);
    btnDiv = (Button) findViewById(R.id.btnDiv);
    textViewResult = (TextView) findViewById(R.id.textViewResult);
    textViewControl = (TextView) findViewById(R.id.textViewControl);

}
private void beeta(){
        if (!Double.isNaN(val1)){
            val2 = Double.parseDouble(textViewControl.getText().toString());
            switch (ACTION){
                case (ADDITION):
                    val1 = val1 + val2;
                    break;
                case (SUBTRACTION):
                    val1 = val1 - val2;
                    break;
                case (MULTIPLICATION):
                    val1 = val1 * val2;
                    break;
                case (DIVISION):
                    val1 = val1/val2;
                    break;
                case eql:
                    break;
            }
        }
        else {
            val1 =  Double.parseDouble(textViewControl.getText().toString());
        }
}


}