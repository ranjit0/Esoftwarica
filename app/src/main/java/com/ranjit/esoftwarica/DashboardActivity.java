package com.ranjit.esoftwarica;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ranjit.esoftwarica.Adapter.CustomRecyclerViewAdapter;
import com.ranjit.esoftwarica.models.Student;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        recyclerView = findViewById(R.id.recyclerview);

        List<Student> studentList = new ArrayList<>();


        studentList.add(new Student("ranjit basu","bhaktapur","male",24,R.drawable.boy));
        studentList.add(new Student("girl name","addressone","female",20,R.drawable.girl));
        studentList.add(new Student("abcd abcd","other address","other",10,R.drawable.other));
        studentList.add(new Student("ranjit basu","bhaktapur","male",24,R.drawable.boy));
        studentList.add(new Student("girl name","addressone","female",20,R.drawable.girl));
        studentList.add(new Student("abcd abcd","other address","other",10,R.drawable.other));
        studentList.add(new Student("ranjit basu","bhaktapur","male",24,R.drawable.boy));
        studentList.add(new Student("girl name","addressone","female",20,R.drawable.girl));
        studentList.add(new Student("abcd abcd","other address","other",10,R.drawable.other));
        studentList.add(new Student("ranjit basu","bhaktapur","male",24,R.drawable.boy));
        studentList.add(new Student("girl name","addressone","female",20,R.drawable.girl));
        studentList.add(new Student("abcd abcd","other address","other",10,R.drawable.other));


        CustomRecyclerViewAdapter customRecyclerViewAdapter = new CustomRecyclerViewAdapter(studentList,this);
        recyclerView.setAdapter(customRecyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
