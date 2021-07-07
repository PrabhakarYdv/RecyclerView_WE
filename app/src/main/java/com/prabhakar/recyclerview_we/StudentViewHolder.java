package com.prabhakar.recyclerview_we;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvName;
    private TextView mTvAge;
    private TextView mTvRollNo;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        iniView(itemView);
    }

    private void iniView(View itemView) {
        mTvName = itemView.findViewById(R.id.name);
        mTvAge = itemView.findViewById(R.id.age);
        mTvRollNo = itemView.findViewById(R.id.roll_No);
    }

    public void setData(Student student) {
        mTvName.setText(student.getName());
        mTvAge.setText(student.getAge()+"");
        mTvRollNo.setText(student.getRolNo());
    }
}
