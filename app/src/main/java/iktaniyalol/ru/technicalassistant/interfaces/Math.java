package iktaniyalol.ru.technicalassistant.interfaces;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Math extends MainActivity {
    Button logar, function, step, urav;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        logar = findViewById(R.id.logarif);
        function = findViewById(R.id.theor2);
        step = findViewById(R.id.sqrt);
        urav = findViewById(R.id.uravbutton);


        View.OnClickListener OLLog = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Math.this, Logarifm.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLTheor2 = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Math.this, PreGraph.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLStep = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Math.this, KorenStepen.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLUrav = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Math.this, Urav.class);
                startActivity(intent);
            }
        };

        function.setOnClickListener(OLTheor2);
        logar.setOnClickListener(OLLog);
        step.setOnClickListener(OLStep);
        urav.setOnClickListener(OLUrav);
    }
}
