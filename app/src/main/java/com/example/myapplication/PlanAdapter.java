package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.List;

public class PlanAdapter extends RecyclerView.Adapter<PlanAdapter.myViewHolder> {
    private List<String> planList;
    public EditText lsTitle;
    public CheckBox cbCheckBox;

    public PlanAdapter(List<String>planList){
       this.planList=planList;
    }

    public void notifyPlanIserted(int i) {
    }

    class myViewHolder extends RecyclerView.ViewHolder{
        EditText editText;

        public myViewHolder(View planView) {
editText=editText.findViewById(R.id.lsTitle);
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
        String title=planList.get(position);
        holder.editText.setText((CharSequence) planList);

    }


    @Override
    public int getItemCount() {
        return planList.size();
    }
}
