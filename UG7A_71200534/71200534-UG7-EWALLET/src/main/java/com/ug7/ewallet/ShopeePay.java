package com.ug7.ewallet;

public class ShopeePay extends eWallet{
    private int feeTopup=500;
    private int feeTransfer=0;
    private int feeWithdraw=1000;

    public ShopeePay(User user){
        super(User);
    }

    public String topup(int jumlah){
        super(user.setUang(uang-jumlah-feeTopup));
        setSaldo(jumlah);
    }

    public void transfer(eWallet eWallet, int jumlah){

    }

    public void withdraw(int jumlah){

    }

    public void getInfo(){
        System.out.println("[ShopeePay e-Wallet]");
        System.out.println("Nama: "+super(user.getNama())+"["+super(user.getPIN())+"]");
        System.out.println("Email:"+super(user.getEmail());
        System.out.println("Uang: "+super(user.getUang());
        System.out.println("Saldo e-Wallet: ");
    }
}
