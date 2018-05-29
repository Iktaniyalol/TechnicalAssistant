package iktaniyalol.ru.technicalassistant.interfaces;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Test extends MainActivity implements OnClickListener {
    private Button schit;
    private String[] levelNames = {"Лёгкий", "Средний", "Сложный"};
    public static int level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        schit = (Button) findViewById(R.id.schitbutton);

        schit.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.schitbutton) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Выберите уровень сложности:").setSingleChoiceItems(levelNames,
                    0, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            level = which;
                            Intent intent = new Intent(Test.this, SchitGame.class);
                            startActivity(intent);
                        }
                    });
            AlertDialog ad = builder.create();
            ad.show();
        }
    }

}
