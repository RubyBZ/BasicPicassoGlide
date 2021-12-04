package com.example.basicpicassoglide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    // *** Don't forget to add in manifest
    // *** android:usesCleartextTraffic="true"
    // *** with internet permission

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView picassoImageView = findViewById(R.id.picassoImageView);
        ImageView glideImageView = findViewById(R.id.glideImageView);

        //Both picasso & glide failed to upload images from unsplash website
        Picasso.get()
                .load("http://i.imgur.com/DvpvklR.png")
                //.load("https://images.unsplash.com/photo-1500297726361-1715d90aec00?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1047&q=80")
                .into(picassoImageView);

        Glide.with(this)
                .load("http://goo.gl/gEgYUd")
                //.load("https://images.unsplash.com/photo-1567930009485-07d60c813306?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80")
                .into(glideImageView);

    }
}