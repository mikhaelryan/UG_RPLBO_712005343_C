package com.ug6.soal1;

import java.util.ArrayList;
import java.util.Arrays;

public class VendingMachines {
    private String code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods = new ArrayList<Goods>();
    private ArrayList<Double> acceptanceBalance = new ArrayList<Double>();
    private double consumerMoney;

    public VendingMachines(String code, int capacity) {
        this.code = code;
        this.capacity = capacity;
    }

    public VendingMachines() {
    }

    public VendingMachines(String code, int capacity, Goods goods, double acceptanceBalance) {
        this.code = code;
        this.capacity = capacity;
        this.goods.add(goods);
        this.acceptanceBalance.add(acceptanceBalance);
    }

    public void proceedOrder(String goodsCode, int orderQuantity){
        this.code=goodsCode;
        this.usedCapacity=this.usedCapacity+orderQuantity;
    }

    public void takeMoney(double money){
        if(Arrays.asList(acceptanceBalance).contains(money)){
            withdrawMoney();
        }
    }

    private void giveGood(double goodsPrice, String goodsName){
        System.out.println(goodsPrice+goodsName);
    }

    public double withdrawMoney(){
        return this.consumerMoney;
    }

    public void inputGoods(Goods good){
        this.goods.add(good);
    }
}
