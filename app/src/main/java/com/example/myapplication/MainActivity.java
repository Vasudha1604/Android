package com.example.myapplication;
import android.view.View.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView;
import android.view.View;
import android.arch.lifecycle.ViewModelProviders;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    TextView textView;
    String[] listItem;
    static int employee_count=0;
    //Button button;
    private MyViewModel model;


    //List<int>EmployeeIds=new ArrayList<>();
    int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.button_send);
        List<Employee> EmployeeDetail = new ArrayList<>();
        Employee e=new Employee("Vasudha",1);
        EmployeeDetail.add(e);
        e=new Employee("Bhuvan",2);
        EmployeeDetail.add(e);
        e=new Employee("Welcome",4);
        EmployeeDetail.add(e);

        model = ViewModelProviders.of(this).get(MyViewModel.class);
        model.getUsers().observe(this,EmployeeList -> {
            // update UI4231
            ArrayAdapter<Employee> records = new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, EmployeeList);

            //button=(Button) findViewById(R.id.button_send);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Employee e=EmployeeDetail.get(index);
                    int id=e.getId();
                    String name=e.getName();
                    records.add(e);
                }
            });
            ListView listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(records);
        });



    }


    }


