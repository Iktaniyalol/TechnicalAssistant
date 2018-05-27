package iktaniyalol.ru.technicalassistant.interfaces;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends FragmentActivity {

    Button math, info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        math = findViewById(R.id.math);
        info = findViewById(R.id.info);


        View.OnClickListener OLMath = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Math.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLInfo = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Info.class);
                startActivity(intent);
            }
        };

        math.setOnClickListener(OLMath);
        info.setOnClickListener(OLInfo);

    }
}
