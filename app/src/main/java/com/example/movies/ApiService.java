package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface ApiService {
    @GET("movie?token=GBP5A58-80N40N5-JZFD5GD-XGBXH5Y&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&page=2&limit=40")
    Single<MovieResponse> loadMovies();
}
