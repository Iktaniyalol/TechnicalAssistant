package iktaniyalol.ru.technicalassistant.interfaces;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.vansuita.materialabout.builder.AboutBuilder;
import com.vansuita.materialabout.views.AboutView;


public class MainActivity extends FragmentActivity {

    Button math, info;
    ImageButton about;
    ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        math = findViewById(R.id.math);
        info = findViewById(R.id.info);
        about = findViewById(R.id.about);

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
        View.OnClickListener OLAbout = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutMe.class);
                startActivity(intent);
            }
        };
        math.setOnClickListener(OLMath);
        info.setOnClickListener(OLInfo);
        about.setOnClickListener(OLAbout);
    }
}
