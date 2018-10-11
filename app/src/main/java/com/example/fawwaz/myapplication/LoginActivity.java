package com.example.fawwaz.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fawwaz.myapplication.util.PreferencesHelper;

public class LoginActivity extends AppCompatActivity {
    PreferencesHelper instance;
    private EditText Username;
    private EditText Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        instance = PreferencesHelper.getIntance(getApplicationContext());

        Username = (EditText) findViewById(R.id.Username);
        Password = (EditText) findViewById(R.id.Password);
    }
    public void  Login(View view) {
        String un = Username.getText().toString();
        String pw = Password.getText().toString();
        Toast.makeText(getApplicationContext(), "Succes Login", Toast.LENGTH_SHORT).show();
        instance.setLogin(true);
        instance.setName(un);

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        Bundle bundle = new Bundle();

        bundle.putString("nama", un);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}
