package iktaniyalol.ru.technicalassistant.interfaces;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Phys extends MainActivity {
    Button one, two, three, four, five;
    public static int razdel;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phys);
        one = findViewById(R.id.mechanica);
        two = findViewById(R.id.molec);
        three = findViewById(R.id.electrodin);
        four = findViewById(R.id.volnykoleb);
        five = findViewById(R.id.optica);
        View.OnClickListener OLMech = new View.OnClickListener() {
            public void onClick(View view) {
                razdel = 0;
                Intent intent = new Intent(Phys.this, PhysResh.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLMolec = new View.OnClickListener() {
            public void onClick(View view) {
                razdel = 1;
                Intent intent = new Intent(Phys.this, PhysResh.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLElect = new View.OnClickListener() {
            public void onClick(View view) {
                razdel = 2;
                Intent intent = new Intent(Phys.this, PhysResh.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLVoln = new View.OnClickListener() {
            public void onClick(View view) {
                razdel = 3;
                Intent intent = new Intent(Phys.this, PhysResh.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLOptic = new View.OnClickListener() {
            public void onClick(View view) {
                razdel = 4;
                Intent intent = new Intent(Phys.this, PhysResh.class);
                startActivity(intent);
            }
        };
        one.setOnClickListener(OLMech);
        two.setOnClickListener(OLMolec);
        three.setOnClickListener(OLElect);
        four.setOnClickListener(OLVoln);
        five.setOnClickListener(OLOptic);
    }
}
