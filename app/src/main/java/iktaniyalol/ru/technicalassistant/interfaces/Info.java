package iktaniyalol.ru.technicalassistant.interfaces;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Info extends MainActivity {
    Button sys, dey;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        sys = findViewById(R.id.sys);
        dey = findViewById(R.id.resh4);


        View.OnClickListener OLSys = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Info.this, Numbertosystem.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLDey = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Info.this, Numberdeysystem.class);
                startActivity(intent);
            }
        };
        sys.setOnClickListener(OLSys);
        dey.setOnClickListener(OLDey);

    }
}
