package com.example.educationapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerplaylistContentAdapter extends RecyclerView.Adapter<RecyclerplaylistContentAdapter.ViewHolder> {
    Context context;
    ArrayList<ContentModel2> arrayList;

    RecyclerplaylistContentAdapter(Context context, ArrayList<ContentModel2> arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerplaylistContentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.playlistdata, parent, false);
        RecyclerplaylistContentAdapter.ViewHolder viewHolder1 = new RecyclerplaylistContentAdapter.ViewHolder(view);
        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerplaylistContentAdapter.ViewHolder holder, int position) {
        holder.contentImage.setImageResource(arrayList.get(position).image);
        holder.languageName.setText(arrayList.get(position).languageName);
        holder.videoDuration.setText(arrayList.get(position).videoDuration);
        holder.videoDescription.setText(arrayList.get(position).aboutLanguage);
        holder.contentImage.setOnClickListener(view -> {
            Intent intent = new Intent(context, Player.class);
            context.startActivity(intent);
        });
        holder.mCardView.setOnClickListener(view -> {
            Intent intent = new Intent(context, Player.class);
            context.startActivity(intent);
        });
        holder.languageName.setOnClickListener(view -> {
            Intent intent = new Intent(context, Player.class);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView contentImage;
        private TextView languageName;
        private TextView videoDuration;
        private TextView videoDescription;
        private CardView mCardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contentImage = itemView.findViewById(R.id.javaImage);
            languageName = itemView.findViewById(R.id.language);
            videoDuration = itemView.findViewById(R.id.durationText);
            videoDescription = itemView.findViewById(R.id.Description);
            mCardView = itemView.findViewById(R.id.Java);
        }
    }
}
