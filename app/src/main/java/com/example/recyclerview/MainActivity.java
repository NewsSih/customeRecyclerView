package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Declare a RecyclerView object reference
    RecyclerView recyclerView;
    // Declare an adapter
    RecyclerView.Adapter programAdapter;
    RecyclerView.LayoutManager layoutmanager;
    // Next, prepare your data set. Create two string arrays for program name and program description respectively.
    String[] programNameList = {"One", "Two", "Three", "Android", "HTML5", "CSS3", "JavaScript", "jQuery", "Bootstrap", "PHP",
            "MySQL", "CodeIgniter", "React", "NodeJS", "AngularJS", "PostgreSQL", "Python", "C#", "Wordpress", "GitHub"};
    String[] programDescriptionList = {"PIB Mumbai", "PIB Delhi", "PIB Chennai",
            "Android Description", "HTML5 Description",
            "CSS3 Description", "JavaScript Description", "jQuery Description",
            "Bootstrap Description", "PHP Description", "MySQL Description",
            "CodeIgniter Description", "React Description", "NodeJS Description",
            "AngularJS Description", "PostgreSQL Description", "Python Description",
            "C# Description", "Wordpress Description", "GitHub Description"};
    // Define an integer array to hold the image recourse ids



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvProgram);
        // You may use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // Use a linear layout manager
        layoutmanager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutmanager);
        // Create an instance of ProgramAdapter. Pass context and all the array elements to the constructor
        programAdapter = new ProgramAdapter(this, programNameList, programDescriptionList);
        // Finally, attach the adapter with the RecyclerView
        recyclerView.setAdapter(programAdapter);
    }
}