package com.prabhakar.recyclerview_we;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildStudentList();
        setRecyclerView();
    }

    private void initView() {
        recyclerView = findViewById(R.id.recycleView);
    }

    private void buildStudentList() {
        studentList = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            Student student = new Student("Name_" + i, 20, "00" + i);
            studentList.add(student);
        }
    }

    private void setRecyclerView() {
        StudentAdapter studentAdapter = new StudentAdapter(studentList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }

}