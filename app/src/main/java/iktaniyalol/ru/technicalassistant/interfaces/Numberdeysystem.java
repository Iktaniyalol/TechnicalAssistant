package iktaniyalol.ru.technicalassistant.interfaces;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import iktaniyalol.ru.technicalassistant.NumberSys;

public class Numberdeysystem extends Info {
    String[] data = {"двоичная", "восьмиричная", "десятичная", "шестнадцатиричная"};
    String[] data1 = {"двоичная", "восьмиричная", "десятичная", "шестнадцатиричная"};
    String[] data2 = {"сложение", "вычитание", "умножение", "деление"};
    String[] data3 = {"Результат в двоичной", "Результат в восьмиричной", "Результат в десятичной", "Результат в шестнадцатиричной"};
    Button result;
    int number, number1, number2, number3, sys, sys1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbersysdey);
        result = findViewById(R.id.resultinfo);
        final EditText one = (EditText) findViewById(R.id.input3);
        final EditText two = (EditText) findViewById(R.id.input5);
        final TextView resultinfo = findViewById(R.id.resultdey);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = (Spinner) findViewById(R.id.spinner5);
        spinner.setAdapter(adapter);
        spinner.setPrompt("Выберите систему счисления:");
        spinner.setSelection(0);


        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner4);
        spinner1.setAdapter(adapter1);
        spinner1.setPrompt("Выберите систему счисления:");
        spinner1.setSelection(0);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner3);
        spinner2.setAdapter(adapter2);
        spinner2.setPrompt("Выберите действие:");
        spinner2.setSelection(0);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data3);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner6);
        spinner3.setAdapter(adapter3);
        spinner3.setPrompt("Выберите действие:");
        spinner3.setSelection(0);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (position) {
                    case 0:
                        number = 2;
                        break;
                    case 1:
                        number = 8;
                        break;
                    case 2:
                        number = 10;
                        break;
                    case 3:
                        number = 16;
                        break;
                }
                sys = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg2) {
            }
        });
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position1, long id) {
                switch (position1) {
                    case 0:
                        number1 = 2;
                        break;
                    case 1:
                        number1 = 8;
                        break;
                    case 2:
                        number1 = 10;
                        break;
                    case 3:
                        number1 = 16;
                        break;
                }
                sys1 = position1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg2) {
            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position2, long id) {
                number2 = position2;

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg2) {
            }
        });
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position3, long id) {
                number3 = position3;

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg2) {
            }
        });

        View.OnClickListener OLInfo = new View.OnClickListener() {
            public void onClick(View view) {
                if (one.getText().toString().equals("") || two.getText().toString().equals("")) {
                    resultinfo.setText("0");
                } else {
                    resultinfo.setText(NumberSys.deystvia(one.getText().toString(), two.getText().toString(), number, sys, number1, sys1, number2, number3));

                }
            }
        };
        result.setOnClickListener(OLInfo);
    }
}
