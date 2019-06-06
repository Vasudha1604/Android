package com.example.myapplication;

public class Employee {
    private int id;
    private String name;

   Employee(String name,int id)
   {
       this.name=name;
       this.id=id;
   }
   public void playerNameSet(String name){
        this.name=name;
    }

    public void setid(int id)
    {
        this.id=id;
    }

    public String getName()
    {
        return this.name;
    }

    public int getId()
    {
        return this.id;
    }


};
