package com.ug7.ewallet;

public class GoPay extends eWallet{
    private int feeTopup=1000;
    private int feeTransfer=500;
    private int feeWithdraw=2500;

    public GoPay(User user){
        super(User);
    }

    public String topup(int jumlah){
        if (jumlah>10000){

        }
    }

    public void getInfo(){
        System.out.println("[GoPay e-Wallet]");
        System.out.println("Nama: "+super(User.getNama())+"["+super(User.getPIN()+)"]");
        System.out.println("Email:"+super(User.getEmail());
        System.out.println("Uang: "+super(User.getUang());
        System.out.println("Saldo e-Wallet: ");
    }

    public void transfer(eWallet eWallet, int jumlah){

    }

    public void withdraw(int jumlah){

    }
}
