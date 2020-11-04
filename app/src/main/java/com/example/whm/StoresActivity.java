package com.example.whm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class StoresActivity extends AppCompatActivity {
    RecyclerView recyclerView ;

    String s1[] ,s2[];
    int images[] = {R.drawable.stores,R.drawable.store2 ,R.drawable.stores};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stores);
        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.stores_names);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this,s1 ,s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this ));


    }
}