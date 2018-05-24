package iktaniyalol.ru.technicalassistant.interfaces;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import iktaniyalol.ru.technicalassistant.Resh;

public class Logarifm extends MainActivity {
    Button result;
    public double inp1, inp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        final EditText one = (EditText) findViewById(R.id.input);
        final EditText two = (EditText) findViewById(R.id.input1);
        result = findViewById(R.id.resultkr);
        final TextView result2 = findViewById(R.id.resultkr1);
        View.OnClickListener OLresult = new View.OnClickListener() {
            public void onClick(View view) {
                if (one.getText().toString().equals("") || two.getText().toString().equals("")) {
                    result2.setText("0");
                } else {
                    inp1 = Double.parseDouble(one.getText().toString());
                    inp2 = Double.parseDouble(two.getText().toString());
                    result2.setText(String.valueOf(Resh.logarifm(inp2, inp1)));
                }


            }
        };
        result.setOnClickListener(OLresult);
    }
}
