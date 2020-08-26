package com.muflihundev.recipeapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.muflihundev.recipeapp.R;
import com.muflihundev.recipeapp.model.ModelResep;

import java.util.ArrayList;

public class AdapterResep extends RecyclerView.Adapter<AdapterResep.MyHolder> {
    private ArrayList<ModelResep> list;
    private OnItemClickCallback onItemClickCallback;

    public void setOnitemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback{
        void onItemClicked(ModelResep data);
    }

    void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public AdapterResep(ArrayList<ModelResep> list){
        this.list = list;
    }

    @NonNull
    @Override
    public AdapterResep.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_resep,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterResep.MyHolder holder, int position) {
        // set data
        holder.tvNamaResep.setText(list.get(position).getNamaResep());
        Glide.with(holder.itemView.getContext())
                .load(list.get(position).getGambarResep())
                .into(holder.imgResep);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Fungsi Item Diklik
                onItemClickCallback.onItemClicked(list.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        // Variabel
        TextView tvNamaResep;
        ImageView imgResep;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaResep = itemView.findViewById(R.id.tv_nama_resep);
            imgResep = itemView.findViewById(R.id.img_resep);
        }
    }
}
