package com.example.recee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList= new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.andy,"Buddy 1"));
        exampleList.add(new ExampleItem(R.drawable.board,"Buddy 2"));
        exampleList.add(new ExampleItem(R.drawable.rode,"Buddy 3"));
        exampleList.add(new ExampleItem(R.drawable.andy,"Buddy 4"));
        exampleList.add(new ExampleItem(R.drawable.board,"Buddy 5"));
        exampleList.add(new ExampleItem(R.drawable.rode,"Buddy 6"));
        exampleList.add(new ExampleItem(R.drawable.andy,"Buddy 7"));
        exampleList.add(new ExampleItem(R.drawable.board,"Buddy 8"));
        exampleList.add(new ExampleItem(R.drawable.rode,"Buddy 9"));

        mRecyclerView=findViewById(R.id.recyclerView);

        mLayoutManager=new LinearLayoutManager(this);
        mAdapter=new ExampleAdapter(exampleList);

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }
}
