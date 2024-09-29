package com.example.recordshopui.ui.addAlbum;


import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.recordshopui.R;
import com.example.recordshopui.databinding.ActivityAddNewAlbumBinding;
import com.example.recordshopui.databinding.ActivityMainBinding;
import com.example.recordshopui.model.Album;
import com.example.recordshopui.model.AlbumRepository;
import com.example.recordshopui.ui.mainactivity.MainActivityViewModel;

public class AddNewAlbumActivity extends AppCompatActivity {
    private ActivityAddNewAlbumBinding binding;
    private AddNewAlbumClickHandler handler;
    private Album album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_new_album);
        album = new Album();

        binding = DataBindingUtil.setContentView(this,R.layout.activity_add_new_album);
        MainActivityViewModel viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        handler = new AddNewAlbumClickHandler(album,this,viewModel);

        binding.setAlbum(album);
        binding.setClickHandler(handler);

    }
}