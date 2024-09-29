package com.example.recordshopui.ui.addAlbum;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.example.recordshopui.model.Album;
import com.example.recordshopui.ui.mainactivity.MainActivity;
import com.example.recordshopui.ui.mainactivity.MainActivityViewModel;

public class AddNewAlbumClickHandler {
    private Album album;
    private Context context;
    private MainActivityViewModel viewModel;

    public AddNewAlbumClickHandler(Album album, Context context, MainActivityViewModel viewModel) {
        this.album = album;
        this.context = context;
        this.viewModel = viewModel;
    }

    public void onSubmitBtnClicked(View view){
        if(album.getArtist() == null || album.getName()==null||album.getGenre() ==null|| album.getReleaseYear()==null){
            Toast.makeText(context, "Fields cannot be empt", Toast.LENGTH_SHORT).show();
        }else {
            Intent intent= new Intent(context, MainActivity.class);
            Album newAlbum = new Album(
                    album.getId(), album.getName(), album.getArtist(), album.getGenre(), album.getReleaseYear()
            );
            viewModel.addAlbum(newAlbum);
            context.startActivity(intent);
        }
    }

    public void onBackButtonClicked(View view){
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }
}
