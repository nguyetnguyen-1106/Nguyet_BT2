package com.example.recycleviewexercise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import category.Category;
import cakes.Cakes;
import category.CategoryAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvCategory.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }

    private List<Category> getListCategory(){
        List<Category> listCategory = new ArrayList<>();
        List<Cakes> listCake = new ArrayList<>();

        listCake.add(new Cakes(R.drawable.cake1, "Bánh tiêu"));
        listCake.add(new Cakes(R.drawable.cake2, "Bánh Pizza"));
        listCake.add(new Cakes(R.drawable.cake3, "Bánh su kem"));
        listCake.add(new Cakes(R.drawable.cake4,"Bánh Doreamon"));
        listCake.add(new Cakes(R.drawable.cake5,"Bánh sữa chua"));


        listCategory.add(new Category("Top bánh ngon", listCake));
        listCategory.add(new Category("Top bánh ngon", listCake));
        listCategory.add(new Category("Top bánh ngon", listCake));
        listCategory.add(new Category("Top bánh ngon", listCake));

        return listCategory;
    }
}