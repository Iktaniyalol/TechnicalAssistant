package iktaniyalol.ru.technicalassistant.interfaces;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends FragmentActivity {

    Button logar, theor2, step, urav, sys, resh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logar = findViewById(R.id.logarif);
        theor2 = findViewById(R.id.theor2);
        step = findViewById(R.id.sqrt);
        urav = findViewById(R.id.uravbutton);
        sys = findViewById(R.id.sys);
        resh = findViewById(R.id.resh4);

        View.OnClickListener OLLog = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Logarifm.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLTheor2 = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TheorGem.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLStep = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KorenStepen.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLUrav = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Urav.class);
                startActivity(intent);
            }
        };

        View.OnClickListener OLSys = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Numbertosystem.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLResh = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Numberdeysystem.class);
                startActivity(intent);
            }
        };
        sys.setOnClickListener(OLSys);
        resh.setOnClickListener(OLResh);
        theor2.setOnClickListener(OLTheor2);
        logar.setOnClickListener(OLLog);
        step.setOnClickListener(OLStep);
        urav.setOnClickListener(OLUrav);
    }
}
