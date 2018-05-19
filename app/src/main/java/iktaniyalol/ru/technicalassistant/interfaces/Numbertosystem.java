package iktaniyalol.ru.technicalassistant.interfaces;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import iktaniyalol.ru.technicalassistant.NumberSys;
import iktaniyalol.ru.technicalassistant.Resh;

public class Numbertosystem extends MainActivity {
    String[] data = {"двоичная", "восьмиричная", "десятичная", "шестнадцатиричная"};
    String[] data1 = {"двоичная", "восьмиричная", "десятичная", "шестнадцатиричная"};
    Button result;
    int number, number1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbersys);
        result = findViewById(R.id.resultinfo);
        public final EditText one = (EditText) findViewById(R.id.input3);
        final TextView resultinfo = findViewById(R.id.resultkv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        spinner.setPrompt("Выберите систему счисления");
        spinner.setSelection(2);


        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner2);
        spinner1.setAdapter(adapter1);
        spinner1.setPrompt("Выберите систему счисления");
        spinner1.setSelection(0);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                number = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg2) {
            }
        });
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position1, long id) {
                number1 = position1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg2) {
            }
        });

        View.OnClickListener OLInfo = new View.OnClickListener() {
            public void onClick(View view) {
                if (one.getText().toString().equals("")) {
                    resultinfo.setText("0");
                } else {
                    switch (number) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            resultinfo.setText(NumberSys.DectoSys(one.getText().toString(), number1));
                            break;
                        case 3:
                            resultinfo.setText(NumberSys.HextoSys(one.getText().toString(), number1));
                            break;
                    }
                }
            }
        };
        result.setOnClickListener(OLInfo);
    }
}
