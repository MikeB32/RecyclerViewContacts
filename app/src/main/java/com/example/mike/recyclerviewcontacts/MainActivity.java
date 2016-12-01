package com.example.mike.recyclerviewcontacts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    //DATA SOURCE
    String[] names={"Icardi","Candreva","Milito","Perisic","Zanetti"};
    String[] positions={"Striker","Winger", "Striker","Winger","Defender"};
    int[] images={R.drawable.icardi,R.drawable.candreva,R.drawable.milito,R.drawable.perisic,R.drawable.zanetti,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView rv= (RecyclerView) findViewById(R.id.myRecycler);

        rv.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter=new MyAdapter(this,names,positions,images);
        rv.setAdapter(adapter);


    }


}