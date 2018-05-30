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
            {"Не выбрано", "Фотометрия", "Геометрическая (лучевая) оптика", "Волновая оптика"},

    };
    public static Integer[][] formuls = {};
    private static Integer[][] Mech = {
            {R.drawable.kinetic1, R.drawable.kinetic2, R.drawable.kinetic3, R.drawable.kinetic4, R.drawable.kinetic5, R.drawable.kinetic6, R.drawable.kinetic7, R.drawable.kinetic8, R.drawable.kinetic9, R.drawable.kinetic10, R.drawable.kinetic11, R.drawable.kinetic12, R.drawable.kinetic13, R.drawable.kinetic14, R.drawable.kinetic15, R.drawable.kinetic16, R.drawable.kinetic17, R.drawable.kinetic18, R.drawable.kinetic19, R.drawable.kinetic20, R.drawable.kinetic21, R.drawable.kinetic22, R.drawable.kinetic23, R.drawable.kinetic24, R.drawable.kinetic25, R.drawable.kinetic26, R.drawable.kinetic27, R.drawable.kinetic28, R.drawable.kinetic29, R.drawable.kinetic30},
            {R.drawable.din1, R.drawable.din2, R.drawable.din3, R.drawable.din4, R.drawable.din5, R.drawable.din6, R.drawable.din7, R.drawable.din8, R.drawable.din9, R.drawable.din10, R.drawable.din11, R.drawable.din12, R.drawable.din13, R.drawable.din14, R.drawable.din15, R.drawable.din16, R.drawable.din17, R.drawable.din18, R.drawable.din19, R.drawable.din20, R.drawable.din21, R.drawable.din22},
            {R.drawable.static1, R.drawable.static2, R.drawable.static3, R.drawable.static4, R.drawable.static5},
            {R.drawable.zak1, R.drawable.zak2, R.drawable.zak3, R.drawable.zak4, R.drawable.zak5, R.drawable.zak6, R.drawable.zak7, R.drawable.zak8, R.drawable.zak9, R.drawable.zak10, R.drawable.zak11, R.drawable.zak12},
            {R.drawable.dav1, R.drawable.dav2, R.drawable.dav3, R.drawable.dav4, R.drawable.dav5},
    };
    private static Integer[][] Molec = {
            {R.drawable.mol1, R.drawable.mol2, R.drawable.mol3, R.drawable.mol4, R.drawable.mol5, R.drawable.mol6, R.drawable.mol7, R.drawable.mol8, R.drawable.mol9, R.drawable.mol10, R.drawable.mol11, R.drawable.mol12, R.drawable.mol13, R.drawable.mol14, R.drawable.mol15, R.drawable.mol16, R.drawable.mol17, R.drawable.mol18, R.drawable.mol19, R.drawable.mol20, R.drawable.mol21, R.drawable.mol22},
            {R.drawable.tep1, R.drawable.tep2, R.drawable.tep3, R.drawable.tep4, R.drawable.tep5, R.drawable.tep6},
            {R.drawable.agr1, R.drawable.agr2, R.drawable.agr3, R.drawable.agr4, R.drawable.agr5, R.drawable.agr6, R.drawable.agr7, R.drawable.agr8, R.drawable.agr9, R.drawable.agr10, R.drawable.agr11, R.drawable.agr12, R.drawable.agr13, R.drawable.agr14, R.drawable.agr15},
            {R.drawable.term1, R.drawable.term2, R.drawable.term3, R.drawable.term4, R.drawable.term5, R.drawable.term6, R.drawable.term7, R.drawable.term8, R.drawable.term9},
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
        list.add(new ItemData("Не выбрано", R.drawable.nulls));
        for (int i = 0; i < formuls[tema].length; i++) {
            list.add(new ItemData("", formuls[tema][i]));
        }
        Spinner sp = (Spinner) findViewById(R.id.spinner1);
        SpinnerAdapter adapter1 = new SpinnerAdapter(this,
                R.layout.spinner_layout, R.id.txt, list);
        sp.setAdapter(adapter1);

    }
}
