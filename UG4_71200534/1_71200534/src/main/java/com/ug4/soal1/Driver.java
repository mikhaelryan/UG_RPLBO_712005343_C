package com.ug4.soal1;

public class Driver {
    String name;
    int age;
    String gender;

    public Driver(String drivername, String drivergender, int driverage){
        name=drivername;
        age=driverage;
        gender=drivergender;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name=newName;

    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        age=newAge;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String newGender){
        gender=newGender;
    }
}
