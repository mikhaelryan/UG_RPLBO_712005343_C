package com.ug4.soal1;

public class Passenger {
    String name;
    double balance;
    String email;
    String destiny;

    public Passenger(String passengerName, String passengeremail, double passengerbalance){
        name=passengerName;
        email=passengeremail;
        balance=passengerbalance;
    }

    public String getName(){
        return name;
    }

    public void setName(String newname){
        name=newname;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double newBalance){
        balance=newBalance;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail){
        email=newEmail;
    }

    public String getDestiny(){
        return destiny;
    }

    public void setDestiny(String newDestiny){
        destiny=newDestiny;
    }
}
