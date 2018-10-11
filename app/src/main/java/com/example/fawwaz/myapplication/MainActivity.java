package com.example.fawwaz.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();
        TextView nama = (TextView) findViewById(R.id.user);
        nama.setText(bundle.getCharSequence("nama"));
    }


    public void adduser(View view) {
    }

    public void listuser(View view) {
    }

    public void keyfragment(View view) {
        Intent intent = new Intent(MainActivity.this, FragmentActivity.class );
        startActivity(intent);
    }

    public void keyactivity(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class );
        startActivity(intent);
    }
}
