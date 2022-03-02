package com.ug4.soal1;

import java.sql.Driver;
import java.util.ArrayList;
public class Bus {
    String name;
    Driver driver;
    private int CAPACITY;
    final ArrayList<Passenger> passenger;
    int usedCapacity;
    final double fares;
    double profit;
    String[] ROUTE;

    public Bus(String busName, Driver busDriver){
        name = busName;
        driver = busDriver;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name=newName;
    }

    public Driver getDriver(){
        return driver;
    }

    public void setDriver(Driver newDriver){
        driver=newDriver;
    }

    public String getCapacity(){
        return CAPACITY;
    }

    public ArrayList<Passenger> getPassenger(){
        return passenger;
    }

    public int getUsedCapacity(){
        return usedCapacity;
    }

    private void setUsedCapacity(int newUsedCapacity){
        usedCapacity=newUsedCapacity;
    }

    public double getFares(){
        return fares;
    }

    public double getProfit(){
        return profit;
    }

    public String[] getRoute(){
        return ROUTE;
    }

    private void setProfit(double newProfit){
        profit=newProfit;
    }

    public boolean checkPassengerBalance(Passenger.getBalance){
        return Passenger balance;
    }

    public void topUpBalance(double topUp, Passenger){
        Passenger balance = Passenger balance + topUp;
    }

    private void takePassenger(Passenger passengerName){
        passenger.add(passengerName);
    }

    public void dropPassenger(Passenger passengerName){
        passenger.remove(passengerName);
    }

    public void ProceedOrder(String order, Passenger destiny){
        Passenger destiny = order;
    }

    public String cancelOrder(Passenger destiny){
        return Passenger destiny;
    }
}


