package com.home.littlebarcaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    List<String> playerNames = Arrays.asList("Ronaldo", "Zidane", "Figo", "Carlos", "Maldini", "Buffon");
    List<Player> littleBarcaList = new ArrayList<>();
    Player ronaldo = new Player("Ronaldo (Brazilian)", 20);
    Player zidane = new Player("Zidane", 21);
    Player figo = new Player("Figo", 22);
    Player carlos = new Player("Carlos", 20);
    Player maldini = new Player("Maldini", 24);
    Player buffon = new Player("Buffon", 23);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.barcaListView);
        littleBarcaList.add(ronaldo);
        littleBarcaList.add(zidane);
        littleBarcaList.add(figo);
        littleBarcaList.add(carlos);
        littleBarcaList.add(buffon);
        littleBarcaList.add(maldini);
        ArrayAdapter<String> teamAdaptor = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                playerNames);
        listView.setAdapter(teamAdaptor);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent moveToPlayerIntent = new Intent(getBaseContext(), PlayerDetailActivity.class);
        moveToPlayerIntent.putExtra("PlayerObj", littleBarcaList.get(position));
        startActivity(moveToPlayerIntent);
    }
}
