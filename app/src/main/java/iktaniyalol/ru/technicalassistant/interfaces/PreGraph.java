package iktaniyalol.ru.technicalassistant.interfaces;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class PreGraph extends Math {
    String[] data = {"не выбрано", "линейный(y = kx)", "линейный(y = kx + b)", "парабола", "гипербола"};
    static int number;
    Button result;
    public static double inp1, inp2, inp3, inp4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregraph);
        result = findViewById(R.id.button);
        final TextView info = findViewById(R.id.text);
        final EditText one = (EditText) findViewById(R.id.input);
        final EditText two = (EditText) findViewById(R.id.input1);
        final EditText three = (EditText) findViewById(R.id.input2);
        final EditText four = (EditText) findViewById(R.id.input3);
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
                        info.setVisibility(View.INVISIBLE);
                        one.setVisibility(View.INVISIBLE);
                        two.setVisibility(View.INVISIBLE);
                        three.setVisibility(View.INVISIBLE);
                        four.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        info.setVisibility(View.VISIBLE);
                        info.setText("Введите данные графика y = kx:");
                        one.setVisibility(View.VISIBLE);
                        one.setHint("Введите k");
                        two.setVisibility(View.INVISIBLE);
                        three.setVisibility(View.INVISIBLE);
                        four.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        info.setVisibility(View.VISIBLE);
                        info.setText("Введите данные графика y = kx + b:");
                        one.setVisibility(View.VISIBLE);
                        one.setHint("Введите k");
                        two.setVisibility(View.VISIBLE);
                        two.setHint("Введите b");
                        three.setVisibility(View.INVISIBLE);
                        four.setVisibility(View.INVISIBLE);
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
                            Intent intent = new Intent(PreGraph.this, Graphic.class);
                            startActivity(intent);
                        }
                        break;
                    case 2:
                        if ((!one.getText().toString().equals("")) && (!two.getText().toString().equals(""))) {
                            inp1 = Double.parseDouble(one.getText().toString());
                            inp2 = Double.parseDouble(two.getText().toString());
                            Intent intent = new Intent(PreGraph.this, Graphic.class);
                            startActivity(intent);
                        }
                        break;

                }

            }
        };
        result.setOnClickListener(OLResult);
    }
}
