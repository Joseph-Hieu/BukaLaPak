package com.example.bukalapak;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import com.example.bukalapak.Adapter.ProAdapter;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private Vector<ViewPro> data;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        recyclerView = findViewById(R.id.recyclePro);
        data = new Vector<ViewPro>();
        data.add(new ViewPro(R.drawable.spesial));
        data.add(new ViewPro(R.drawable.spesial));
        data.add(new ViewPro(R.drawable.spesial));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        ProAdapter adapter = new ProAdapter(R.layout.view_pro_layout, data);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
