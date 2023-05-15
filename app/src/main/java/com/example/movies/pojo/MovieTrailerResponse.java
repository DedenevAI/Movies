package com.example.movies.pojo;

import com.google.gson.annotations.SerializedName;

public class MovieTrailerResponse {
   @SerializedName("videos")
   private Trailers trailers;

   public MovieTrailerResponse(Trailers trailers) {
      this.trailers = trailers;
   }

   public Trailers getTrailers() {
      return trailers;
   }

   @Override
   public String toString() {
      return "MovieTrailerResponse{" +
              "trailers=" + trailers +
              '}';
   }
}
