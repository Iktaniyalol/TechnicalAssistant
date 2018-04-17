package iktaniyalol.ru.technicalassistant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Math extends MainActivity {
    Button theor1, theor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        theor1 = findViewById(R.id.theor1);
        theor2 = findViewById(R.id.theor2);
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
        theor2.setOnClickListener(OLTheor2);
        theor1.setOnClickListener(OLTheor1);
    }

}
