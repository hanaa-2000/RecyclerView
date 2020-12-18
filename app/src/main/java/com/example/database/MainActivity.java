package com.example.database;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recyclerview);

        ArrayList<Movies> movies=new ArrayList<>();
        movies.add(new Movies(R.drawable.download__14_,"0108768331"));
        movies.add(new Movies(R.drawable.images__36_,"0103887734"));
        movies.add(new Movies(R.drawable.download__14_,"0108568331"));
        movies.add(new Movies(R.drawable.images__36_,"0109763246"));
        movies.add(new Movies(R.drawable.download__14_,"0108768331"));
        movies.add(new Movies(R.drawable.images__36_,"0103887734"));
        movies.add(new Movies(R.drawable.download__14_,"0108568331"));
        movies.add(new Movies(R.drawable.images__36_,"0109763246"));

        Movies_list_Adapter adapter=new Movies_list_Adapter(movies);
        RecyclerView.LayoutManager im=new GridLayoutManager(this,1);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(im);
        rv.setAdapter(adapter);





    }
}