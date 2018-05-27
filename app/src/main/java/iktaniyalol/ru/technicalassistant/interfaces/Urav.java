package iktaniyalol.ru.technicalassistant.interfaces;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import iktaniyalol.ru.technicalassistant.Resh;

public class Urav extends Math {
    Button result;
    public double inp1, inp2, inp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urav);
        final EditText one = (EditText) findViewById(R.id.input3);
        final EditText two = (EditText) findViewById(R.id.input2);
        final EditText three = (EditText) findViewById(R.id.input4);
        final TextView result1 = findViewById(R.id.resultkv1);
        final TextView result2 = findViewById(R.id.resultkv2);
        result = findViewById(R.id.resultkv);
        View.OnClickListener OLresult = new View.OnClickListener() {
            public void onClick(View view) {
                if (one.getText().toString().equals("") || two.getText().toString().equals("") || three.getText().toString().equals("")) {
                    result1.setText("0");
                    result2.setText("0");
                } else {
                    inp1 = Double.parseDouble(one.getText().toString());
                    inp2 = Double.parseDouble(two.getText().toString());
                    inp3 = Double.parseDouble(three.getText().toString());
                    double resultkv[] = Resh.uravkv(inp1, inp2, inp3);
                    result1.setText(String.valueOf(resultkv[0]));
                    result2.setText(String.valueOf(resultkv[1]));
                }

            }
        };
        result.setOnClickListener(OLresult);

    }

}
