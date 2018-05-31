package iktaniyalol.ru.technicalassistant.interfaces;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.vansuita.materialabout.builder.AboutBuilder;
import com.vansuita.materialabout.views.AboutView;

import static iktaniyalol.ru.technicalassistant.interfaces.SchitGame.GAME_PREFS;


public class MainActivity extends FragmentActivity {
    public static SharedPreferences gamePrefs;
    Button math, info, phys, test;
    ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gamePrefs = getSharedPreferences(GAME_PREFS, Context.MODE_PRIVATE);
        math = findViewById(R.id.math);
        info = findViewById(R.id.info);
        phys = findViewById(R.id.phys);
        test = findViewById(R.id.test);

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
        View.OnClickListener OLPhys = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Phys.class);
                startActivity(intent);
            }
        };
        View.OnClickListener OLTest = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Test.class);
                startActivity(intent);
            }
        };
        math.setOnClickListener(OLMath);
        info.setOnClickListener(OLInfo);
        phys.setOnClickListener(OLPhys);
        test.setOnClickListener(OLTest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Intent intent = new Intent(MainActivity.this, AboutMe.class);
            startActivity(intent);
        }
        if (id == R.id.action_profile) {
            Intent intent = new Intent(MainActivity.this, Profile.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
