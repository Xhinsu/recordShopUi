package com.example.recordshopui.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.time.LocalDate;

public class Album extends BaseObservable {
    private long id;
    private String name;
    private String artist;
    private String genre;
    private LocalDate releaseYear;

    public Album(){};

    public Album(long id, String name, String artist, String genre, LocalDate releaseYear) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }


    @Bindable
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
        notifyPropertyChanged(Br.id);
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(Br.name);

    }

    @Bindable
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
        notifyPropertyChanged(Br.artist);
    }

    @Bindable
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
        notifyPropertyChanged(Br.genre);
    }

    @Bindable
    public LocalDate getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(LocalDate releaseYear) {
        this.releaseYear = releaseYear;
        notifyPropertyChanged(Br.releaseYear);
    }
}
