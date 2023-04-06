package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class PlanAdapter extends RecyclerView.Adapter<PlanAdapter.myViewHolder> {
    private ArrayList<Plan>planList;
    public EditText lsTitle;
    public CheckBox cbCheckBox;

    public PlanAdapter(ArrayList<Plan>planList){
        this.planList=planList;
    }
       class myViewHolder extends RecyclerView.ViewHolder{
           public myViewHolder() {

           }
       }

    public PlanAdapter(CheckBox cbCheckBox) {
        this.cbCheckBox = cbCheckBox;
    }

    public PlanAdapter(EditText lsTitle) {
        this.lsTitle = lsTitle;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        
          View planView= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_plan,parent,false);
         return new myViewHolder(planView);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.editText.setText((CharSequence) planList);
        String title=planList.get(position).getTitle();
    }


    @Override
    public int getItemCount() {
        return planList.size();
    }
}
