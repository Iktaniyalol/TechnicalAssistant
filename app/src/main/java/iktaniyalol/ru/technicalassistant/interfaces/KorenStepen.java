package iktaniyalol.ru.technicalassistant.interfaces;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import iktaniyalol.ru.technicalassistant.Resh;

public class KorenStepen extends Math {
    Button result;
    public double inp1, inp2, inp3, inp4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korenstepen);
        final EditText one = (EditText) findViewById(R.id.input);
        final EditText two = (EditText) findViewById(R.id.input1);
        final EditText three = (EditText) findViewById(R.id.input2);
        final EditText four = (EditText) findViewById(R.id.input3);
        final TextView result1 = findViewById(R.id.resultkr2);
        final TextView result2 = findViewById(R.id.resultkr1);
        result = findViewById(R.id.resultkr);
        View.OnClickListener OLresult = new View.OnClickListener() {
            public void onClick(View view) {
                if (one.getText().toString().equals("") || two.getText().toString().equals("")) {
                    result2.setText("0");
                } else {
                    inp1 = Double.parseDouble(one.getText().toString());
                    inp2 = Double.parseDouble(two.getText().toString());
                    result2.setText(String.valueOf(Resh.koren(inp1, inp2)));
                }
                if (three.getText().toString().equals("") || four.getText().toString().equals("")) {
                    result1.setText("0");
                } else {
                    inp3 = Double.parseDouble(three.getText().toString());
                    inp4 = Double.parseDouble(four.getText().toString());
                    result1.setText(String.valueOf(Resh.stepen(inp4, inp3)));
                }


            }
        };
        result.setOnClickListener(OLresult);

    }

}
