package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private List<String> planList;
private RecyclerView recyclerView;
private PlanAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
planList=new ArrayList<>();
recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LayoutManager(this));
        adapter =new planAdapter(planList);
        recyclerView.setAdapter(adapter);
        Button btn=findViewById(R.id.btnPlan);
        EditText editText=findViewById(R.id.tplan);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                planList.add(String.valueOf(new Plan("",false)));
                adapter.notifyPlanIserted(planList.size()-1);
            }
        });
setPlan();
setAdapter();
                }
    private void setAdapter() {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void setPlan(){
        planList.add(String.valueOf(new Plan("Go Shopping",false)));
                    planList.add(String.valueOf(new Plan("Play video games",true)));
                    planList.add(String.valueOf(new Plan("Watch Soccer",false)));
                    planList.add(String.valueOf(new Plan("Finish my project",false)));
                }
            }