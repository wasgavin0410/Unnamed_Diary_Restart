package com.example.gavin.unnamed_diary;

import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter4Main extends RecyclerView.Adapter<adapter4Main.theViewHolder>{

    private ArrayList<String> List4Storage;

    public adapter4Main(ArrayList<String> dataFromMain){

        this.List4Storage = dataFromMain;

    }

    public class theViewHolder extends RecyclerView.ViewHolder{

        public ImageView theIcon,theChatBox;
        public TextView theText;

        public theViewHolder(View v){

            super(v);
            theIcon = v.findViewById(R.id.theIcon);
            theChatBox = v.findViewById(R.id.theChatBox);
            theText = v.findViewById(R.id.messageView);

            theText.setMovementMethod(new ScrollingMovementMethod());
        }

    }


    @Override
    public theViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_items,parent,false);

        theViewHolder takeOnMe = new theViewHolder(itemView);

        return takeOnMe;

    }

    @Override
    public void onBindViewHolder(theViewHolder holder, int position) {

        holder.theText.setText(List4Storage.get(position));

    }

    @Override
    public int getItemCount() {

        return List4Storage.size();

    }

}