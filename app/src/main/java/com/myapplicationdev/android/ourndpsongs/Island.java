package com.myapplicationdev.android.ourndpsongs;

import java.io.Serializable;

import androidx.annotation.NonNull;

public class Island implements Serializable {

    private int id;
    private String title;
    private String description;
    private int area;
    private int stars;

    public Island(int id, String title, String description, int area, int stars) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.area = area;
        this.stars = stars;

    }

    public int getId() {
        return id;
    }

    public Island setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Island setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Island setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getArea() { return area; }

    public Island setArea(int area) {
        this.area = area;
        return this;
    }

    public int getStars() {
        return stars;
    }

    public Island setStars(int stars) {
        this.stars = stars;
        return this;
    }

    @NonNull
    @Override
    public String toString() {
        String starsString = "";
        for(int i = 0; i < stars; i++){
            starsString += "*";
        }
        return title + "\n" + description + "\n" + area + " + " + starsString;

    }
}
