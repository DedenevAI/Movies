package com.example.movies.pojo;

import com.example.movies.pojo.MovieResponse;
import com.example.movies.pojo.MovieTrailerResponse;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("movie?token=9K4W1NS-ZJMMM25-H6312P4-XRX975G&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=40")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie/{id}?token=9K4W1NS-ZJMMM25-H6312P4-XRX975G")
    Single<MovieTrailerResponse> loadTrailers(@Path("id") int id);
}
