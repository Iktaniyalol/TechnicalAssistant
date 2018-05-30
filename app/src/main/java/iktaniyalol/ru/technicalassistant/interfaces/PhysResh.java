package iktaniyalol.ru.technicalassistant.interfaces;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

import iktaniyalol.ru.technicalassistant.ItemData;
import iktaniyalol.ru.technicalassistant.SpinnerAdapter;

public class PhysResh extends MainActivity {
    public static String[][] data = {
            {"Не выбрано", "Кинематика", "Динамика", "Статика", "Законы сохранения мех. энергии", "Давление жидкости и газа"},
            {"Не выбрано", "Молекулярная кинетика", "Тепловые явления", "Пар, жидкости и твёрдое состояние", "Термодинамика"},
            {"Не выбрано", "Электростатика", "Постоянный ток", "Магнитное поле", "Электромагнитная индукция", "Электрический ток в металлах"},
            {"Не выбрано", "Механические колебания", "Механические волны", "Электромагнитные колебания", "Переменный ток", "Электромагнитные волны"},
            {"Не выбрано", "Фотометрия", "Геометрическая (лучевая) оптика", "Геометрическая (лучевая) оптика", "Волновая оптика"},

    };
    public static Integer[][] formuls = {};
    private static Integer[][] Mech = {
            {R.drawable.kinetic1, R.drawable.kinetic2, R.drawable.kinetic3, R.drawable.kinetic4, R.drawable.kinetic5, R.drawable.kinetic6, R.drawable.kinetic7, R.drawable.kinetic8, R.drawable.kinetic9, R.drawable.kinetic10, R.drawable.kinetic11, R.drawable.kinetic12, R.drawable.kinetic13, R.drawable.kinetic14, R.drawable.kinetic15, R.drawable.kinetic16, R.drawable.kinetic17, R.drawable.kinetic18, R.drawable.kinetic19, R.drawable.kinetic20, R.drawable.kinetic21, R.drawable.kinetic22, R.drawable.kinetic23, R.drawable.kinetic24, R.drawable.kinetic25, R.drawable.kinetic26, R.drawable.kinetic27, R.drawable.kinetic28, R.drawable.kinetic29, R.drawable.kinetic30},
            {R.drawable.din1},
    };
    private static Integer[][] Molec = {
            {R.drawable.kinetic1, R.drawable.kinetic2},
            {R.drawable.din1},
    };
    private static Integer[][] Elec = {
            {R.drawable.kinetic1, R.drawable.kinetic2},
            {R.drawable.din1},
    };
    private static Integer[][] Kol = {
            {R.drawable.kinetic1, R.drawable.kinetic2},
            {R.drawable.din1},
    };
    private static Integer[][] Opt = {
            {R.drawable.kinetic1, R.drawable.kinetic2},
            {R.drawable.din1},
    };
    public static int tema;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resh);
        final Spinner formula = findViewById(R.id.spinner1);
        switch (Phys.razdel) {
            case 0:
                formuls = Mech;
                break;
            case 1:
                formuls = Molec;
                break;
            case 2:
                formuls = Elec;
                break;
            case 3:
                formuls = Kol;
                break;
            case 4:
                formuls = Opt;
                break;

        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data[Phys.razdel]);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        spinner.setPrompt("Выберите раздел:");
        spinner.setSelection(0);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                tema = position - 1;
                if (position > 0) {
                    formula.setVisibility(View.VISIBLE);
                    setSpin();
                } else {
                    formula.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg2) {
            }
        });
        formula.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg2) {
            }
        });
    }

    private void setSpin() {
        ArrayList<ItemData> list = new ArrayList<>();
        for (int i = 0; i < formuls[tema].length; i++) {
            list.add(new ItemData("", formuls[tema][i]));
        }
        Spinner sp = (Spinner) findViewById(R.id.spinner1);
        SpinnerAdapter adapter1 = new SpinnerAdapter(this,
                R.layout.spinner_layout, R.id.txt, list);
        sp.setAdapter(adapter1);

    }
}
