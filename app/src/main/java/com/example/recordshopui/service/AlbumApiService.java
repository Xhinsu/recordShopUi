package com.example.recordshopui.service;

import com.example.recordshopui.model.Album;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AlbumApiService {

@GET("album")
Call<List<Album>> getAllAlbums();
}
