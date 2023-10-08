package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class RegActivity extends AppCompatActivity {

    private RecyclerView categoryRVreg, apiRV;

    private ArrayList<CategoryRVModal> categoryRVModalArrayListreg;

    private ArrayList<APIRVModal> APIRVMoadlArraylist;

    private CategoryRVAdapter  categoryRVAdapterreg;
    private ImageButton homeBtn, regBtn, profileBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        categoryRVModalArrayListreg = new ArrayList<>();
        categoryRVAdapterreg = new CategoryRVAdapter(categoryRVModalArrayListreg, this, this::onCategoryClick);
        categoryRVreg.setAdapter(categoryRVAdapterreg);
        getCategories();




        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(RegActivity.this, MainActivity.class);
                startActivity(home);
            }
        });

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg = new Intent(RegActivity.this, RegActivity.class);
                startActivity(reg);
            }
        });

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg = new Intent(RegActivity.this, ProfileActivity.class);
                startActivity(reg);
            }
        });
    }
    private void getCategories(){
        categoryRVModalArrayListreg.add(new CategoryRVModal("All", "https://images.unsplash.com/photo-1504711434969-e33886168f5c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8bmV3c3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        categoryRVModalArrayListreg.add(new CategoryRVModal("Technology", "https://images.unsplash.com/photo-1488590528505-98d2b5aba04b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8dGVjaG5vbG9neXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=1000&q=60"));
        categoryRVModalArrayListreg.add(new CategoryRVModal("Science", "https://images.unsplash.com/photo-1451187863213-d1bcbaae3fa3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE4fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60"));
        categoryRVModalArrayListreg.add(new CategoryRVModal("Sports", "https://images.unsplash.com/photo-1552674605-db6ffd4facb5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80"));
        categoryRVModalArrayListreg.add(new CategoryRVModal("Business", "https://images.unsplash.com/39/lIZrwvbeRuuzqOoWJUEn_Photoaday_CSD%20%281%20of%201%29-5.jpg?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjh8fEJ1c2luZXNzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60"));
        categoryRVModalArrayListreg.add(new CategoryRVModal("General", "https://images.unsplash.com/photo-1504711434969-e33886168f5c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8bmV3c3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        categoryRVModalArrayListreg.add(new CategoryRVModal("Entertainment", "https://images.unsplash.com/photo-1603190287605-e6ade32fa852?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80"));
        categoryRVModalArrayListreg.add(new CategoryRVModal("Health", "https://images.unsplash.com/photo-1505751172876-fa1923c5c528?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80"));
        categoryRVAdapterreg.notifyDataSetChanged();
    }
    public void onCategoryClick(int position) {
        String category = categoryRVModalArrayListreg.get(position).getCategory();
        getAPI(category);
    }

    private void getAPI(String category) {
    }
}