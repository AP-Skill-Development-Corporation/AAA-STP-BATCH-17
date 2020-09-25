package com.example.recyclerview1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>
{

    Context context;

    int[] img;

    String[] name;

    public MyAdapter(MainActivity mainActivity, int[] images, String[] names)
    {
        this.context=mainActivity;
        this.img=images;
        this.name=names;

    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view=LayoutInflater.from(context).inflate(R.layout.row_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

        holder.myimage.setImageResource(img[position]);
        holder.myname.setText(name[position]);

    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        ImageView myimage;

        TextView myname;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);

            myimage=itemView.findViewById(R.id.img);

            myname=itemView.findViewById(R.id.tv);
        }
    }
}
