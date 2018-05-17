package iktaniyalol.ru.technicalassistant.interfaces;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import iktaniyalol.ru.technicalassistant.interfaces.R;

public class Math extends MainActivity {
    Button theor1, theor2, step, urav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        theor1 = findViewById(R.id.theor1);
        theor2 = findViewById(R.id.theor2);
        step = findViewById(R.id.sqrt);
        urav = findViewById(R.id.uravbutton);
        View.OnClickListener OLTheor1 = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Math.this, TheorAlg.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLTheor2 = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Math.this, TheorGem.class);
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
        theor2.setOnClickListener(OLTheor2);
        theor1.setOnClickListener(OLTheor1);
        step.setOnClickListener(OLStep);
        urav.setOnClickListener(OLUrav);
    }

}
