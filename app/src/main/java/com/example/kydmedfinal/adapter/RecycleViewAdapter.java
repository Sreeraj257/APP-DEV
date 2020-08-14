package com.example.kydmedfinal.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kydmedfinal.R;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ProgramViewHolder>{





    private Context context ;
    private String[] data;
    public RecycleViewAdapter(String[] data)
    {
        this.data=data;
    }

    @NonNull
    @Override
    public ProgramViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view =inflater.inflate(R.layout.list_item,parent,false);
        return new ProgramViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramViewHolder holder, int position) {
        String title=data[position];
        holder.txttitle.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    public class ProgramViewHolder extends RecyclerView.ViewHolder{
        ImageView imggicon;
        TextView txttitle;
        public ProgramViewHolder(View view)
        {
            super(view);
            imggicon = view.findViewById(R.id.imgicon);
            txttitle =view.findViewById(R.id.texttitle);

        }
    }
}
