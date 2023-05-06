package com.example.educationapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageView;
    CardView mCardView;
    private ImageButton mChangeView;
    private ImageButton mPlay;
    private ImageButton mPause;
    private ImageButton mSkipPrevious;
    private ImageButton mSkipNext;
    private boolean isResume = true;
    private SimpleExoPlayer player;
    private final boolean isSkipPrevious = true;
    private PlayerView mPlayerView;
    private RecyclerView mRecyclerView;
    private RecyclerView mChooseRecycler;
    private boolean Resumeflag = true;
    private boolean HorizontalView = false;
    android.os.Handler handler;
    private Button mStartedButton;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        mCardView = findViewById(R.id.Java);

        mImageView = findViewById(R.id.javaImage);
        mStartedButton = findViewById(R.id.mGetStartedButton);
        mPause = findViewById(R.id.pause);
        mSkipPrevious = findViewById(R.id.skipPrevious);
        mSkipNext = findViewById(R.id.skipNext);
        mPlayerView = findViewById(R.id.mStreamingPlayer);
        mChangeView = findViewById(R.id.changeView);
        mRecyclerView = findViewById(R.id.recyclerContact);
        mChooseRecycler = findViewById(R.id.chooseThePlaylist);


        //Divert to the contentCard Activity.
        mStartedButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, contentcard.class)));


        //MediaItem mediaItem2= MediaItem.fromUri("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4");

      /*  mChooseRecycler = findViewById(R.id.chooseThePlaylist);
        mChooseRecycler.setLayoutManager(new GridLayoutManager(this, 2));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.java));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.java));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.java));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.java));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.java));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.java));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.java));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.java));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.java));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.java));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.java));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.java));

        RecyclerplaylistContentAdapter adapter1 = new RecyclerplaylistContentAdapter(this, arrayListChoosePlaylist);
        mChooseRecycler.setAdapter(adapter1);*/


    }





}




