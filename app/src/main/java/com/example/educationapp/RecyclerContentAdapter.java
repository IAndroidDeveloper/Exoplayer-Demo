package com.example.educationapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;

import java.util.ArrayList;

public class RecyclerContentAdapter extends RecyclerView.Adapter<RecyclerContentAdapter.ViewHolder> {
    Context context;
    ArrayList<ContentModel> arrayList;

    RecyclerContentAdapter(Context context, ArrayList<ContentModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerviewcontent, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.exoPlayer.setImageResource(arrayList.get(position).exoPlayer);
        holder.videoName.setText(arrayList.get(position).videoName);
        holder.channelName.setText(arrayList.get(position).channelName);
        holder.likeDuration.setText(arrayList.get(position).likeDuration);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView videoName, channelName, likeDuration;
        ImageView exoPlayer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            exoPlayer = itemView.findViewById(R.id.mPlayerViewInside);
            videoName = itemView.findViewById(R.id.VideoName);
            channelName = itemView.findViewById(R.id.PlaylistName);
            likeDuration = itemView.findViewById(R.id.likeDuration);
        }
    }
}
