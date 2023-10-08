package com.example.newsapp;

public class CategoryRVModal {

    private String category;
    private String categoryImageURL;

    public CategoryRVModal(String category, String catrgoryImageUTL) {
        this.category = category;
        this.categoryImageURL = catrgoryImageUTL;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryImageURL() {
        return categoryImageURL;
    }

    public void setCategoryImageURL(String categoryImageURL) {
        this.categoryImageURL = categoryImageURL;
    }
}
