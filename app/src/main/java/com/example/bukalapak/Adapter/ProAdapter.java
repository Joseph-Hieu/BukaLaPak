package com.example.bukalapak.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.bukalapak.R;
import com.example.bukalapak.ViewPro;

import java.util.Vector;

public class ProAdapter extends RecyclerView.Adapter<ProAdapter.MyViewHolder> {
    private int layoutID;
    private Vector<ViewPro> data;

    public ProAdapter(int layoutID, Vector data) {
        this.layoutID = layoutID;
        this.data = data;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewPro);
        }
    }

    @Override
    public ProAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        CardView listViewItem = (CardView) inflater.inflate(layoutID, viewGroup, false);
        return new MyViewHolder(listViewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ProAdapter.MyViewHolder viewHolder, int i) {
        viewHolder.imageView.setImageDrawable(viewHolder.imageView.getResources().getDrawable(data.get(i).getImgResourceId()));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
