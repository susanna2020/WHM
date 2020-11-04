package com.example.whm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class BalancesActivity extends AppCompatActivity {
    RecyclerView recyclerView2;

    String s5[] ,s6[];
    int images3[] = {R.drawable.items ,R.drawable.items  ,R.drawable.items};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balances);
        recyclerView2 = findViewById(R.id.recyclerView2);

        s5= getResources().getStringArray(R.array.Weights);
        s6 = getResources().getStringArray(R.array.dates);

        MyAdapter myAdapter3 = new MyAdapter(this,s5 ,s6, images3);
        recyclerView2.setAdapter(myAdapter3);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this ));
    }
}