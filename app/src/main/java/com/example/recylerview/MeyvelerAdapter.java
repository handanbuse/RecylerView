package com.example.recylerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MeyvelerAdapter extends RecyclerView.Adapter <MeyvelerAdapter.MeyvelerHolder>{


    private ArrayList<Meyveler> meyvelerlist;
    private Context context;

    public MeyvelerAdapter(ArrayList<Meyveler> meyvelerlist, Context context) {
        this.meyvelerlist = meyvelerlist;
        this.context = context;
    }

    @NonNull
    @Override
    public MeyvelerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.meyveler_item,parent, false); // görünüm burada ayarlandı

        return new MeyvelerHolder(v); // alt classı dönderdi
    }

    @Override
    public void onBindViewHolder(@NonNull MeyvelerHolder holder, int position) {

        Meyveler meyveler= meyvelerlist.get(position);
        holder.setData(meyveler);
    }

    @Override
    public int getItemCount() {
        return meyvelerlist.size();
    }

    class MeyvelerHolder extends  RecyclerView.ViewHolder{
        TextView meyveismi, meyvekalori;
        ImageView meyveresim;


        public MeyvelerHolder(@NonNull View itemView) {
            super(itemView);
            meyveismi=itemView.findViewById(R.id.meyveler_item_textview);
            meyvekalori=itemView.findViewById(R.id.meyveler_item_textviewKalori);
            meyveresim= itemView.findViewById(R.id.meyveler_item_ımgView);

        }

        public void setData(Meyveler meyveler){
            this.meyveismi.setText(meyveler.getMeyveismi());
            this.meyvekalori.setText(String.valueOf(meyveler.getMeyveKalori()));
            this.meyveresim.setBackgroundResource(meyveler.getMeyveResmi());



        }
    }

}
