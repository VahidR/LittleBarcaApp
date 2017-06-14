package com.home.littlebarcaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.TextView;

public class PlayerDetailActivity extends AppCompatActivity {

    TextView nameTextView;
    TextView ageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_detail);

        nameTextView = (TextView) findViewById(R.id.title);
        ageTextView = (TextView) findViewById(R.id.age);
        Player player = (Player) getIntent().getExtras().get("PlayerObj");
        String name = player.getName();
        Integer age = player.getAge();
        nameTextView.setText(name);
        ageTextView.setText("Age: " + age);
    }
}
