package iktaniyalol.ru.technicalassistant.interfaces;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class PreGraph extends Math {
    String[] data = {"не выбрано", "линейный (y = kx)", "линейный (y = kx + b)", "парабола (y = ax²)", "парабола (y = ax² + bx + c)"};
    static int number;
    Button result;
    public static double inp1, inp2, inp3, inp4, inp5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregraph);
        result = findViewById(R.id.button);
        final TextView info = findViewById(R.id.text);
        final EditText one = (EditText) findViewById(R.id.input);
        final EditText two = (EditText) findViewById(R.id.input1);
        final EditText three = (EditText) findViewById(R.id.input2);
        final EditText four = (EditText) findViewById(R.id.input3);
        final EditText five = (EditText) findViewById(R.id.input4);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        spinner.setPrompt("Выберите вид графика:");
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                number = position;
                switch (position) {
                    case 0:
                        inp1 = 0;
                        inp2 = 0;
                        inp3 = 0;
                        inp4 = 0;
                        inp5 = 0;
                        one.setText("");
                        two.setText("");
                        three.setText("");
                        four.setText("");
                        five.setText("");
                        info.setVisibility(View.INVISIBLE);
                        one.setVisibility(View.INVISIBLE);
                        two.setVisibility(View.INVISIBLE);
                        three.setVisibility(View.INVISIBLE);
                        four.setVisibility(View.INVISIBLE);
                        five.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        inp1 = 0;
                        inp2 = 0;
                        inp3 = 0;
                        inp4 = 0;
                        inp5 = 0;
                        one.setText("");
                        two.setText("");
                        three.setText("");
                        four.setText("");
                        five.setText("");
                        info.setVisibility(View.VISIBLE);
                        info.setText("Введите данные графика y = kx:");
                        one.setVisibility(View.VISIBLE);
                        one.setHint("Введите k");
                        two.setVisibility(View.VISIBLE);
                        two.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
                        two.setHint("Введите интервал по X и Y(не обязательно)");
                        three.setVisibility(View.INVISIBLE);
                        four.setVisibility(View.INVISIBLE);
                        five.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        inp1 = 0;
                        inp2 = 0;
                        inp3 = 0;
                        inp4 = 0;
                        inp5 = 0;
                        one.setText("");
                        two.setText("");
                        three.setText("");
                        four.setText("");
                        five.setText("");
                        info.setVisibility(View.VISIBLE);
                        info.setText("Введите данные графика y = kx + b:");
                        one.setVisibility(View.VISIBLE);
                        one.setHint("Введите k");
                        two.setVisibility(View.VISIBLE);
                        two.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED | InputType.TYPE_NUMBER_FLAG_DECIMAL);
                        two.setHint("Введите b");
                        three.setVisibility(View.VISIBLE);
                        three.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
                        three.setHint("Введите максимальный интервал по X и Y(не обязательно)");
                        four.setVisibility(View.INVISIBLE);
                        five.setVisibility(View.INVISIBLE);
                        break;
                    case 3:
                        inp1 = 0;
                        inp2 = 0;
                        inp3 = 0;
                        inp4 = 0;
                        inp5 = 0;
                        one.setText("");
                        two.setText("");
                        three.setText("");
                        four.setText("");
                        five.setText("");
                        info.setVisibility(View.VISIBLE);
                        info.setText("Введите данные графика y = ax²:");
                        one.setVisibility(View.VISIBLE);
                        one.setHint("Введите a");
                        two.setVisibility(View.VISIBLE);
                        two.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
                        two.setHint("Введите максимальный интервал по X и Y(не обязательно)");
                        three.setVisibility(View.INVISIBLE);
                        four.setVisibility(View.INVISIBLE);
                        five.setVisibility(View.INVISIBLE);
                        break;
                    case 4:
                        inp1 = 0;
                        inp2 = 0;
                        inp3 = 0;
                        inp4 = 0;
                        inp5 = 0;
                        one.setText("");
                        two.setText("");
                        three.setText("");
                        four.setText("");
                        five.setText("");
                        info.setVisibility(View.VISIBLE);
                        info.setText("Введите данные графика y = ax² + bx + c:");
                        one.setVisibility(View.VISIBLE);
                        one.setHint("Введите a");
                        two.setVisibility(View.VISIBLE);
                        two.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED | InputType.TYPE_NUMBER_FLAG_DECIMAL);
                        two.setHint("Введите b");
                        three.setVisibility(View.VISIBLE);
                        three.setHint("Введите c");
                        four.setVisibility(View.VISIBLE);
                        four.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
                        four.setHint("Введите максимальный интервал по X и Y(не обязательно)");
                        five.setVisibility(View.INVISIBLE);
                        break;
                    case 5:
                        inp1 = 0;
                        inp2 = 0;
                        inp3 = 0;
                        inp4 = 0;
                        inp5 = 0;
                        one.setText("");
                        two.setText("");
                        three.setText("");
                        four.setText("");
                        five.setText("");
                        info.setVisibility(View.VISIBLE);
                        info.setText("Введите данные графика y = k/x:");
                        one.setVisibility(View.VISIBLE);
                        one.setHint("Введите k");
                        two.setVisibility(View.VISIBLE);
                        two.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
                        two.setHint("Введите максимальный интервал по X и Y(не обязательно)");
                        three.setVisibility(View.INVISIBLE);
                        four.setVisibility(View.INVISIBLE);
                        five.setVisibility(View.INVISIBLE);
                        break;
                    case 6:
                        inp1 = 0;
                        inp2 = 0;
                        inp3 = 0;
                        inp4 = 0;
                        inp5 = 0;
                        one.setText("");
                        two.setText("");
                        three.setText("");
                        four.setText("");
                        five.setText("");
                        info.setVisibility(View.VISIBLE);
                        info.setText("Введите данные графика y = k/(x + b) + c:");
                        one.setVisibility(View.VISIBLE);
                        one.setHint("Введите k");
                        two.setVisibility(View.VISIBLE);
                        two.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED | InputType.TYPE_NUMBER_FLAG_DECIMAL);
                        two.setHint("Введите b");
                        three.setVisibility(View.VISIBLE);
                        three.setHint("Введите c");
                        four.setVisibility(View.VISIBLE);
                        four.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
                        four.setHint("Введите максимальный интервал по X и Y(не обязательно)");
                        five.setVisibility(View.INVISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg2) {
            }
        });
        View.OnClickListener OLResult = new View.OnClickListener() {
            public void onClick(View view) {
                switch (number) {
                    case 1:
                        if (!one.getText().toString().equals("")) {
                            inp1 = Double.parseDouble(one.getText().toString());

                            if (!two.getText().toString().equals("")) {
                                inp2 = Double.parseDouble(two.getText().toString());
                            } else {
                                inp2 = 0;
                            }
                            if (inp1 > 10000 || inp1 < -10000 || inp2 > 10000) {
                                return;
                            }
                            Intent intent = new Intent(PreGraph.this, Graphic.class);
                            startActivity(intent);
                        }
                        break;
                    case 2:
                        if ((!one.getText().toString().equals("")) && (!two.getText().toString().equals(""))) {
                            inp1 = Double.parseDouble(one.getText().toString());
                            inp2 = Double.parseDouble(two.getText().toString());
                            if (!three.getText().toString().equals("")) {
                                inp3 = Double.parseDouble(three.getText().toString());
                            } else {
                                inp3 = 0;
                            }
                            if (inp1 > 10000 || inp1 < -10000 || inp2 > 10000 || inp2 < -10000 || inp3 > 10000) {
                                return;
                            }
                            Intent intent = new Intent(PreGraph.this, Graphic.class);
                            startActivity(intent);
                        }
                        break;
                    case 3:
                        if ((!one.getText().toString().equals(""))) {
                            inp1 = Double.parseDouble(one.getText().toString());
                            if (!two.getText().toString().equals("")) {
                                inp2 = Double.parseDouble(two.getText().toString());
                            } else {
                                inp2 = 0;
                            }
                            if (inp1 > 10000 || inp1 < -10000 || inp2 > 10000) {
                                return;
                            }
                            if (!(inp1 == 0)) {
                                Intent intent = new Intent(PreGraph.this, Graphic.class);
                                startActivity(intent);
                            }
                        }
                        break;
                    case 4:
                        if (!one.getText().toString().equals("")) {
                            inp1 = Double.parseDouble(one.getText().toString());
                        }
                        if (!two.getText().toString().equals("")) {
                            inp2 = Double.parseDouble(two.getText().toString());
                        } else {
                            inp2 = 0;
                        }
                        if (!three.getText().toString().equals("")) {
                            inp3 = Double.parseDouble(three.getText().toString());
                        } else {
                            inp3 = 0;
                        }
                        if (!four.getText().toString().equals("")) {
                            inp4 = Double.parseDouble(four.getText().toString());
                        } else {
                            inp4 = 0;
                        }
                        if (inp1 > 10000 || inp1 < -10000 || inp2 > 10000 || inp2 < -10000 || inp3 > 10000 || inp3 < -10000 || inp4 > 10000) {
                            return;
                        }
                        if (!(inp1 == 0)) {
                            Intent intent = new Intent(PreGraph.this, Graphic.class);
                            startActivity(intent);
                        }
                        break;
                    case 5:
                        if (!one.getText().toString().equals("")) {
                            inp1 = Double.parseDouble(one.getText().toString());
                            if (!two.getText().toString().equals("")) {
                                inp2 = Double.parseDouble(two.getText().toString());
                            } else {
                                inp2 = 0;
                            }
                            Intent intent = new Intent(PreGraph.this, Graphic.class);
                            startActivity(intent);
                        }
                        break;
                    case 6:
                        if (!one.getText().toString().equals("")) {
                            inp1 = Double.parseDouble(one.getText().toString());
                        }
                        if (!two.getText().toString().equals("")) {
                            inp2 = Double.parseDouble(two.getText().toString());
                        } else {
                            inp2 = 0;
                        }
                        if (!three.getText().toString().equals("")) {
                            inp3 = Double.parseDouble(three.getText().toString());
                        } else {
                            inp3 = 0;
                        }
                        if (!four.getText().toString().equals("")) {
                            inp4 = Double.parseDouble(four.getText().toString());
                        } else {
                            inp4 = 0;
                        }
                        Intent intent = new Intent(PreGraph.this, Graphic.class);
                        startActivity(intent);
                        break;
                }

            }
        };
        result.setOnClickListener(OLResult);
    }
}
