package com.example.educationapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;

import java.util.ArrayList;

public class Player extends AppCompatActivity {
    ArrayList<ContentModel> arrayList = new ArrayList<>();
    private AppCompatImageView mChangeView;
    private AppCompatImageView mPlay;
    private AppCompatImageView mPause;
    private AppCompatImageView mSkipPrevious;
    private AppCompatImageView mSkipNext;
    private boolean isResume = true;
    private SimpleExoPlayer player;
    private final boolean isSkipPrevious = true;
    private PlayerView mPlayerView;
    private RecyclerView mRecyclerView;
    private RecyclerView mChooseRecycler;
    private boolean Resumeflag = true;
    private boolean HorizontalView = false;
    private AppCompatImageView imageButton;
    private boolean pause = true;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        mRecyclerView = findViewById(R.id.recyclerContact);
        imageButton = findViewById(R.id.pause);
        mPause = findViewById(R.id.pause);
        mSkipPrevious = findViewById(R.id.skipPrevious);
        mSkipNext = findViewById(R.id.skipNext);
        mPlayerView = findViewById(R.id.mStreamingPlayer);
        mChangeView = findViewById(R.id.changeView);
        mRecyclerView = findViewById(R.id.recyclerContact);
        mChooseRecycler = findViewById(R.id.chooseThePlaylist);


        exoplayerControllers();
        if (Resumeflag) {
            mOnResume();
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

            arrayList.add(new ContentModel(R.drawable.round_cast_24, "sdhjfjsdfhh", "Android", "41kLikes|3months"));
            arrayList.add(new ContentModel(R.drawable.round_cast_24, "sdhjfjsdfhh", "Android", "41kLikes|3months"));
            arrayList.add(new ContentModel(R.drawable.round_cast_24, "sdhjfjsdfhh", "Android", "41kLikes|3months"));
            arrayList.add(new ContentModel(R.drawable.round_cast_24, "sdhjfjsdfhh", "Android", "41kLikes|3months"));
            arrayList.add(new ContentModel(R.drawable.round_cast_24, "sdhjfjsdfhh", "Android", "41kLikes|3months"));
            arrayList.add(new ContentModel(R.drawable.round_cast_24, "sdhjfjsdfhh", "Android", "41kLikes|3months"));
            arrayList.add(new ContentModel(R.drawable.round_cast_24, "sdhjfjsdfhh", "Android", "41kLikes|3months"));
            arrayList.add(new ContentModel(R.drawable.round_cast_24, "sdhjfjsdfhh", "Android", "41kLikes|3months"));
            arrayList.add(new ContentModel(R.drawable.round_cast_24, "sdhjfjsdfhh", "Android", "41kLikes|3months"));
            arrayList.add(new ContentModel(R.drawable.round_cast_24, "sdhjfjsdfhh", "Android", "41kLikes|3months"));
            arrayList.add(new ContentModel(R.drawable.round_cast_24, "sdhjfjsdfhh", "Android", "41kLikes|3months"));
            arrayList.add(new ContentModel(R.drawable.round_cast_24, "sdhjfjsdfhh", "Android", "41kLikes|3months"));
            arrayList.add(new ContentModel(R.drawable.round_cast_24, "sdhjfjsdfhh", "Android", "41kLikes|3months"));
            arrayList.add(new ContentModel(R.drawable.round_cast_24, "sdhjfjsdfhh", "Android", "41kLikes|3months"));
            arrayList.add(new ContentModel(R.drawable.round_cast_24, "sdhjfjsdfhh", "Android", "41kLikes|3months"));
            RecyclerContentAdapter adapter = new RecyclerContentAdapter(this, arrayList);
            mRecyclerView.setAdapter(adapter);

        }

    }


    private void exoplayerControllers() {

        player = new SimpleExoPlayer.Builder(this).build();

        mPlayerView.setUseController(false);
        mPlayerView.setPlayer(player);
        mByDefault();
        mSkipPrevious();
        mOnNext();
        player.prepare();
        player.play();
    }

    private void mPausePlayer() {
        player.setPlayWhenReady(false);
        player.getPlaybackState();
    }

    private void mStartPlayer() {
        player.setPlayWhenReady(true);
        player.getPlaybackState();
    }

    private void mSkipPrevious() {
        MediaItem mediaItem = MediaItem.fromUri("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4");
        mSkipPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setMediaItem(mediaItem);
            }
        });
    }

    private void mOnNext() {
        MediaItem mediaItem1 = MediaItem.fromUri("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/TearsOfSteel.mp4");
        mSkipNext.setOnClickListener(view -> player.setMediaItem(mediaItem1));
    }

    private void mByDefault() {
        MediaItem mediaItem2 = MediaItem.fromUri("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WhatCarCanYouGetForAGrand.mp4");
        player.setMediaItem(mediaItem2);
    }

    private void mOnResume() {
        mPause.setOnClickListener(view -> {
            isResume = !isResume;
            if (!isResume) {
                mPausePlayer();
            } else
                mStartPlayer();
        });
    }

    private void mChangeView() {
        mChangeView.setOnClickListener(view ->
        {

        });
    }

    private void mChangeViewVertical() {
        mChangeView.setOnClickListener(view -> setContentView(R.layout.activity_player));
    }
}









































