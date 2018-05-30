package iktaniyalol.ru.technicalassistant.interfaces;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.common.AccountPicker;

public class Auth extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        View btn = (View) findViewById(R.id.sign_in_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = AccountPicker.newChooseAccountIntent(null, null, new String[]{"com.google"},
                        false, null, null, null, null);
                startActivityForResult(intent, 123);

            }
        });
    }
}
