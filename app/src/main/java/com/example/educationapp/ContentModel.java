package com.example.educationapp;

import com.google.android.exoplayer2.ExoPlayer;

public class ContentModel {
int exoPlayer;
String videoName;
String channelName;
String likeDuration;

public ContentModel(int exoPlayer,String videoName, String channelName, String likeDuration)
{
    //this.img=img;
    this.exoPlayer=exoPlayer;
    this.videoName=videoName;
    this.channelName=channelName;
    this.likeDuration=likeDuration;
}


}
