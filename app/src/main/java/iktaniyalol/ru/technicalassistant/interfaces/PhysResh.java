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
            {R.drawable.elec1, R.drawable.elec2, R.drawable.elec3, R.drawable.elec4, R.drawable.elec5, R.drawable.elec6, R.drawable.elec7, R.drawable.elec8, R.drawable.elec9, R.drawable.elec10, R.drawable.elec11, R.drawable.elec12, R.drawable.elec13, R.drawable.elec14, R.drawable.elec15, R.drawable.elec16, R.drawable.elec17, R.drawable.elec18, R.drawable.elec19, R.drawable.elec20, R.drawable.elec21, R.drawable.elec22, R.drawable.elec23, R.drawable.elec24, R.drawable.elec25, R.drawable.elec26, R.drawable.elec27, R.drawable.elec28, R.drawable.elec29, R.drawable.elec30, R.drawable.elec31, R.drawable.elec32, R.drawable.elec33, R.drawable.elec34, R.drawable.elec35, R.drawable.elec36},
            {R.drawable.post1, R.drawable.post2, R.drawable.post3, R.drawable.post4, R.drawable.post5, R.drawable.post6, R.drawable.post7, R.drawable.post8, R.drawable.post9, R.drawable.post10, R.drawable.post11, R.drawable.post12, R.drawable.post13, R.drawable.post14, R.drawable.post15, R.drawable.post16, R.drawable.post17, R.drawable.post18, R.drawable.post19, R.drawable.post20, R.drawable.post21, R.drawable.post22, R.drawable.post23, R.drawable.post24, R.drawable.post25, R.drawable.post26, R.drawable.post27, R.drawable.post28, R.drawable.post29},
            {R.drawable.mag1, R.drawable.mag2, R.drawable.mag3, R.drawable.mag4, R.drawable.mag5, R.drawable.mag6, R.drawable.mag7, R.drawable.mag8, R.drawable.mag9, R.drawable.mag10, R.drawable.mag11, R.drawable.mag12, R.drawable.mag13, R.drawable.mag14, R.drawable.mag15, R.drawable.mag16, R.drawable.mag17, R.drawable.mag18, R.drawable.mag19, R.drawable.mag20, R.drawable.mag21, R.drawable.mag22, R.drawable.mag23, R.drawable.mag24},
            {R.drawable.ind1, R.drawable.ind2, R.drawable.ind3, R.drawable.ind4, R.drawable.ind5, R.drawable.ind6, R.drawable.ind7, R.drawable.ind8, R.drawable.ind9, R.drawable.ind10, R.drawable.ind11, R.drawable.ind12, R.drawable.ind13, R.drawable.ind14, R.drawable.ind15, R.drawable.ind16},
            {R.drawable.met1, R.drawable.met2, R.drawable.met3, R.drawable.met4, R.drawable.met5, R.drawable.met6, R.drawable.met7, R.drawable.met8, R.drawable.met9, R.drawable.met10, R.drawable.met11, R.drawable.met12},
    };
    private static Integer[][] Kol = {
            {R.drawable.mk1, R.drawable.mk2, R.drawable.mk3, R.drawable.mk4, R.drawable.mk5, R.drawable.mk6, R.drawable.mk7, R.drawable.mk8, R.drawable.mk9, R.drawable.mk10, R.drawable.mk11, R.drawable.mk12, R.drawable.mk13, R.drawable.mk14, R.drawable.mk15, R.drawable.mk16, R.drawable.mk17, R.drawable.mk18, R.drawable.mk19, R.drawable.mk20, R.drawable.mk21, R.drawable.mk22, R.drawable.mk23, R.drawable.mk24, R.drawable.mk25, R.drawable.mk26, R.drawable.mk27, R.drawable.mk28, R.drawable.mk29},
            {R.drawable.mvol1, R.drawable.mvol2, R.drawable.mvol3, R.drawable.mvol4, R.drawable.mvol5},
            {R.drawable.elk1, R.drawable.elk2, R.drawable.elk3, R.drawable.elk4, R.drawable.elk5, R.drawable.elk6},
            {R.drawable.pert1, R.drawable.pert2, R.drawable.pert3, R.drawable.pert4, R.drawable.pert5, R.drawable.pert6, R.drawable.pert7, R.drawable.pert8, R.drawable.pert9, R.drawable.pert10, R.drawable.pert11, R.drawable.pert12, R.drawable.pert13, R.drawable.pert14, R.drawable.pert15, R.drawable.pert16, R.drawable.pert17, R.drawable.pert18},
            {R.drawable.elv1, R.drawable.elv2, R.drawable.elv3, R.drawable.elv4, R.drawable.elv5, R.drawable.elv6, R.drawable.elv7},
    };
    private static Integer[][] Opt = {
            {R.drawable.phot1, R.drawable.phot2, R.drawable.phot3},
            {R.drawable.geo1, R.drawable.geo2, R.drawable.geo3, R.drawable.geo4, R.drawable.geo5, R.drawable.geo6, R.drawable.geo7, R.drawable.geo8, R.drawable.geo9, R.drawable.geo10, R.drawable.geo11, R.drawable.geo12, R.drawable.geo13, R.drawable.geo14, R.drawable.geo15, R.drawable.geo16, R.drawable.geo17, R.drawable.geo18, R.drawable.geo19, R.drawable.geo20, R.drawable.geo21, R.drawable.geo22, R.drawable.geo23},
            {R.drawable.vol1, R.drawable.vol2, R.drawable.vol3, R.drawable.vol4, R.drawable.vol5, R.drawable.vol6, R.drawable.vol7, R.drawable.vol8, R.drawable.vol9, R.drawable.vol10},
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
