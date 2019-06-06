    package com.example.myapplication;
import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

public class MyViewModel extends ViewModel {
        private MutableLiveData<List<Employee>> employees;
    List<Employee> EmployeeDetail = new ArrayList<>();
     List<Employee> EmployeeList = new ArrayList<>();
        public LiveData<List<Employee>> getUsers() {
            if (employees == null)
            {
                employees = new MutableLiveData<List<Employee>>();

loadEmloyee();
            }
            return employees;
        }

void loadEmloyee()
{
    List<Employee> EmployeeDetail = new ArrayList<>();
    Employee e=new Employee("Vasudha",1);
    EmployeeDetail.add(e);
    e=new Employee("Bhuvan",2);
    EmployeeDetail.add(e);
    e=new Employee("Welcome",4);
    EmployeeDetail.add(e);

    EmployeeList=EmployeeDetail;

}
}


