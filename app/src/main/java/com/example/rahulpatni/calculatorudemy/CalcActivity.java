package com.example.rahulpatni.calculatorudemy;

import android.app.Activity;
import android.app.IntentService;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalcActivity extends Activity {

    String runningNumber;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);

        ImageButton btnAdd = (ImageButton) findViewById(R.id.btnAdd);
        ImageButton btnMultiply = (ImageButton) findViewById(R.id.btnMultiply);
        ImageButton btnDivide = (ImageButton) findViewById(R.id.btnDivide);
        ImageButton btnSubtract = (ImageButton) findViewById(R.id.btnSubtract);

        ImageButton btnCalculate = (ImageButton) findViewById(R.id.btnCalculate);
        Button btnClear = (Button) findViewById(R.id.btnClear);

        txtResult = (TextView) findViewById(R.id.txtResult);
        runningNumber = "";
        txtResult.setText("");

        btn0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberPressed(0);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberPressed(1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberPressed(2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberPressed(3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberPressed(4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberPressed(5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberPressed(6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberPressed(7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberPressed(8);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberPressed(9);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {

            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                runningNumber = "";
                txtResult.setText("");
            }
        });

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {

            }
        });
    }

    void numberPressed(int number) {
        runningNumber += Integer.toString(number);
        txtResult.setText(runningNumber);
    }
}
