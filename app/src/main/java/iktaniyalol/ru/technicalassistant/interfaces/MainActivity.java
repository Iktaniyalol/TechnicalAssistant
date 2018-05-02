package iktaniyalol.ru.technicalassistant.interfaces;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import iktaniyalol.ru.technicalassistant.interfaces.R;


public class MainActivity extends FragmentActivity {

    Button Math;
    Button Phys;
    Button Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Math = findViewById(R.id.math);
        Phys = findViewById(R.id.phys);
        Info = findViewById(R.id.info);

        View.OnClickListener OLMath = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Math.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLPhys = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Phys.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLInfo = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Info.class);
                startActivity(intent);
            }
        };
        Math.setOnClickListener(OLMath);
        Phys.setOnClickListener(OLPhys);
        Info.setOnClickListener(OLInfo);
    }
}
