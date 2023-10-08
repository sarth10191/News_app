package com.example.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CategoryRVAdapter extends RecyclerView.Adapter<CategoryRVAdapter.ViewHolder> {

    private ArrayList<CategoryRVModal> categoryRVModals;
    private CategoriesOnClickInterface categoriesOnClickInterface;

    public CategoryRVAdapter(ArrayList<CategoryRVModal> categoryRVModals, Context context, CategoriesOnClickInterface categoriesOnClickInterface) {
        this.categoryRVModals = categoryRVModals;
        this.categoriesOnClickInterface = categoriesOnClickInterface;
    }


    @NonNull
    @Override
    public CategoryRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_rv_item,parent,false);
        return new CategoryRVAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryRVAdapter.ViewHolder holder, int position) {
        CategoryRVModal categoryRVModal = categoryRVModals.get(position);
        holder.categoryTV.setText(categoryRVModal.getCategory());
        Picasso.get().load(categoryRVModal.getCategoryImageURL()).into(holder.categoryIV); // Make sure to load the image into the ImageView

        holder.itemView.setOnClickListener(view -> {
            int adapterPosition = holder.getAdapterPosition(); // Get the position using holder
            if (adapterPosition != RecyclerView.NO_POSITION) {
                categoriesOnClickInterface.onCategoryClick(adapterPosition); // Use the obtained position
            }
        });
    }


    @Override
    public int getItemCount() {
        return categoryRVModals.size();
    }

    public interface CategoriesOnClickInterface{
        void onCategoryClick(int position);
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView categoryTV;
        private ImageView categoryIV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryTV = itemView.findViewById(R.id.idTVCategory);
            categoryIV = itemView.findViewById(R.id.idIVCategory);
        }
    }
}
