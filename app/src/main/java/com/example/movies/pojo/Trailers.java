package com.example.movies.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Trailers {
    @SerializedName("trailers")
    private List<Trailer> trailers;

    public Trailers(List<Trailer> trailers) {
        this.trailers = trailers;
    }

    public List<Trailer> getTrailers() {
        return trailers;
    }

    @Override
    public String toString() {
        return "Trailers{" +
                "trailers=" + trailers +
                '}';
    }
}
