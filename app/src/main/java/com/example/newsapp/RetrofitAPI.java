package com.example.newsapp;

import retrofit2.http.GET;
import retrofit2.http.Url;
import retrofit2.Call;
public interface RetrofitAPI {
    @GET
    Call<NewsModal> getALLNews(@Url String url);

    @GET
    Call<NewsModal> getNewsByCategories(@Url String url);
}
