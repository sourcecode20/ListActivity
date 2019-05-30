package com.example.listactivity;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.listactivity.Adapter.ItemAdapter;
import com.example.listactivity.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Item> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        list = new ArrayList<>();
        getList();

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        /*LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);*/

        recyclerView.setAdapter(new ItemAdapter(list, this));

    }

    private void getList() {
        list.add(new Item("Roshan", "Sehore", ""));
        list.add(new Item("Rishabh", "Bhopal", ""));
        list.add(new Item("Arun", "Indore", ""));
        list.add(new Item("Nikita", "Indore", ""));
        list.add(new Item("Nancy", "Indore", ""));
        list.add(new Item("Shweta", "Indore", ""));
        list.add(new Item("Trapti", "Indore", ""));

    }
}
