package com.example.recylerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView ryclrView;
    private MeyvelerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ryclrView=findViewById(R.id.main_activity_reycler);
        adapter= new MeyvelerAdapter(Meyveler.getData(), this);

        ryclrView.setHasFixedSize(true); // boyutsal olarak ayarlama her zaman true yap
        LinearLayoutManager manager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        ryclrView.setLayoutManager(manager);
        ryclrView.setAdapter(adapter);


    }
}