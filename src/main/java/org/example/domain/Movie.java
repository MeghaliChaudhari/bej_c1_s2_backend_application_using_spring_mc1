package org.example.domain;

public class Movie {
    private int movieId;
    private String movieName;
    private  String releaseDate;

    public Movie(int movieId, String movieName, String releaseDate) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
