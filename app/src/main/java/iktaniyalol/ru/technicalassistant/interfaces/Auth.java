package iktaniyalol.ru.technicalassistant.interfaces;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Auth extends MainActivity {
    private EditText username;
    private EditText password;
    public Button login;
    public static String nick = "test";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        username = (EditText) findViewById(R.id.edit_user);
        password = (EditText) findViewById(R.id.edit_password);
        login = (Button) findViewById(R.id.button_login);


        View.OnClickListener OLLogin = new View.OnClickListener() {
            public void onClick(View view) {

                if (username.getText().toString().equals(nick) &&
                        password.getText().toString().equals("test")) {
                    Toast.makeText(getApplicationContext(), "Вход выполнен!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Auth.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Неправильные данные!", Toast.LENGTH_SHORT).show();
                }
            }
        };
        login.setOnClickListener(OLLogin);
    }
}
