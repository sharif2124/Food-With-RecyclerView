package com.sharif.food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyViewHolder> {
    Context context;
    ArrayList<FoodModel>arrayList;
    FoodAdapter(Context context, ArrayList<FoodModel> arrayList){
        this.context=context;
        this.arrayList=arrayList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
       View v = layoutInflater.inflate(R.layout.food_raw,parent,false);
       MyViewHolder myViewHolder = new MyViewHolder(v);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
     holder.foodName.setText(arrayList.get(position).foodname.toString());
     holder.foodDes.setText(arrayList.get(position).foodDes.toString());
     holder.foodImge.setImageResource(arrayList.get(position).foodimg);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView foodName,foodDes;
        ImageView foodImge;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            foodName=itemView.findViewById(R.id.foodNameTv);
            foodDes=itemView.findViewById(R.id.foodDesTv);
            foodImge=itemView.findViewById(R.id.imageview);
            
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, arrayList.get(getAdapterPosition()).foodDes.toString(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
