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

public class MainActivity extends AppCompatActivity {
private ArrayList<Plan>planArrayList;
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
planArrayList=new ArrayList<>();
recyclerView=findViewById(R.id.plan);
        Button btn=findViewById(R.id.btnPlan);
        EditText editText=findViewById(R.id.tplan);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                planArrayList.add(new Plan("",false));
            }
        });
setPlan();
setAdapter();
                }
    private void setAdapter() {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void setPlan(){
        planArrayList.add(new Plan("Go Shopping",false));
                    planArrayList.add(new Plan("Play video games",true));
                    planArrayList.add(new Plan("Watch Soccer",false));
                    planArrayList.add(new Plan("Finish my project",false));
                }
            }