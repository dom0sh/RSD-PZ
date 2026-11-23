package com.ua.moviestore.domain;

import java.math.BigDecimal;

public class Movie {
    private Long id;
    private String title;
    private String director;
    private BigDecimal price;
    private Integer year;
    private String posterUrl;
    private String description;
    private String genre;

    public Movie() {
    }

    public Movie(Long id, String title, String director, BigDecimal price,
                 Integer year, String posterUrl, String description, String genre) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.price = price;
        this.year = year;
        this.posterUrl = posterUrl;
        this.description = description;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
