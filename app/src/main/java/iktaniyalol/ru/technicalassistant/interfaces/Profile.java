package iktaniyalol.ru.technicalassistant.interfaces;

import android.os.Bundle;
import android.widget.TextView;

public class Profile extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        TextView score1, score2, score3, nick;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        nick = findViewById(R.id.nick);
        score1 = findViewById(R.id.score1);
        score2 = findViewById(R.id.score2);
        score3 = findViewById(R.id.score3);
        score1.setText(SchitGame.getScore(0));
        score2.setText(SchitGame.getScore(1));
        score3.setText(SchitGame.getScore(2));
        nick.setText(Auth.nick);
    }
}
