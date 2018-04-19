package com.android.ex2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    Spinner inputSpinner, outputSpinner;
    EditText txtInput, txtOutput;
    Button btnConvert, btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtInput = (EditText) findViewById(R.id.input);
        txtOutput = (EditText) findViewById(R.id.output);
        inputSpinner = (Spinner) findViewById(R.id.spinner_input);
        ArrayAdapter<String> adapterInp = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                Currency.currencyName);
        adapterInp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        inputSpinner.setAdapter(adapterInp);

        //Create spinner for currency type output
        outputSpinner = (Spinner)findViewById(R.id.spinner_output);
        ArrayAdapter<String> adapterOut = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                Currency.currencyName);
        adapterOut.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        outputSpinner.setAdapter(adapterOut);
        outputSpinner.setSelection(1);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOutput.setText("");
                txtInput.setText("");
            }
        });
        btnConvert = (Button) findViewById(R.id.btnConvert);
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double value = Double.valueOf(txtInput.getText().toString());
                if (!Double.isNaN(value)) {
                    double ratioInp = Currency.currencyRatio[inputSpinner.getSelectedItemPosition()];
                    double ratioOut = Currency.currencyRatio[outputSpinner.getSelectedItemPosition()];
                    Double result = value*ratioInp/ratioOut;
                    txtOutput.setText(String.format(Locale.US,"%.3f", result));
                }
            }
        });
    }
}
