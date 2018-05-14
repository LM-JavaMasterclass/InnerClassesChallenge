package com.lm;


/**
 * Created by dev (Tim Butchalka) on 18/09/15, with mods from LM on 5/8/2018.
 */
public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
