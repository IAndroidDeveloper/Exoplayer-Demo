package com.example.educationapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class contentcard extends AppCompatActivity {
    ArrayList<ContentModel2> arrayListChoosePlaylist = new ArrayList<>();
    private RecyclerView mChooseRecycler;
    private ImageView mImageView;
    CardView mCardView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.contentcard);


        mChooseRecycler = findViewById(R.id.chooseThePlaylist);
        mChooseRecycler.setLayoutManager(new GridLayoutManager(this, 1));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.java, "Java", "10Hours and 20 Minutes", "Fully OOPS based and Robust Language"));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.settings, "System Design", "10Hours and 20 Minutes", "Understand how the LLD and HLD System Works"));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.swift, "Swift", "10Hours and 20 Minutes", ""));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.sqlserver, "SQL(Structured Query Language)", "10Hours and 20 Minutes", ""));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.python, "Python", "10Hours and 20 Minutes", ""));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.php, "PHP", "10Hours and 20 Minutes", " "));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.js, "Java Script", "10Hours and 20 Minutes", ""));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.csharp, "C Sharp", "10Hours and 20 Minutes", ""));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.c, "C Language", "10Hours and 20 Minutes", ""));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.atom, "React.js", "10Hours and 20 Minutes", ""));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.html5, "HTML 5", "10Hours and 20 Minutes", " "));
        arrayListChoosePlaylist.add(new ContentModel2(R.drawable.css3, "CSS", "10Hours and 20 Minutes", ""));

        RecyclerplaylistContentAdapter adapter1 = new RecyclerplaylistContentAdapter(this, arrayListChoosePlaylist);
        mChooseRecycler.setAdapter(adapter1);


    }
}