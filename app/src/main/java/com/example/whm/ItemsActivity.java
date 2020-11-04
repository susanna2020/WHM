package com.example.whm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ItemsActivity extends AppCompatActivity {
    RecyclerView recyclerView1;

    String s3[] ,s4[];
    int images2[] = {R.drawable.items ,R.drawable.items  ,R.drawable.items};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
        recyclerView1 = findViewById(R.id.recyclerView1);

        s3= getResources().getStringArray(R.array.items_name);
        s4 = getResources().getStringArray(R.array.item_description);

        MyAdapter myAdapter2 = new MyAdapter(this,s3 ,s4, images2);
        recyclerView1.setAdapter(myAdapter2);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this ));


    }
}