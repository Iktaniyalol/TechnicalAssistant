package iktaniyalol.ru.technicalassistant.interfaces;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import iktaniyalol.ru.technicalassistant.interfaces.R;

public class Info extends MainActivity {
    Button sys, resh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        sys = findViewById(R.id.sys);
        resh = findViewById(R.id.resh4);
        View.OnClickListener OLSys = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Info.this, Numbertosystem.class);
                startActivity(intent);
            }
        };
        sys.setOnClickListener(OLSys);
    }
}
