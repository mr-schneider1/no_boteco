package com.noboteco.noboteco;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.FeedProfileViewHolder> {
    List<FeedProfile> mFeedProfiles;

    RVAdapter(List<FeedProfile> profilesList){
        this.mFeedProfiles = profilesList;
    }

    @Override
    public int getItemCount() {
        return mFeedProfiles.size();
    }

    @NonNull
    @Override
    public FeedProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_dados_feed, parent, false);
        FeedProfileViewHolder fpvh = new FeedProfileViewHolder(v);
        return fpvh;
    }

    @Override
    public void onBindViewHolder(@NonNull FeedProfileViewHolder holder, int position) {
        holder.username.setText(mFeedProfiles.get(position).username);
        holder.noBarHa.setText(mFeedProfiles.get(position).noBarHa);
        holder.avatar.setImageDrawable(mFeedProfiles.get(position).avatar);
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class FeedProfileViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView username;
        TextView noBarHa;
        ImageView avatar;

        FeedProfileViewHolder(View itemView){
            super(itemView);
            cv = itemView.findViewById(R.id.cv);
            username = itemView.findViewById(R.id.username);
            noBarHa = itemView.findViewById(R.id.noBarHa);
            avatar = itemView.findViewById(R.id.avatar);
        }
    }
}
