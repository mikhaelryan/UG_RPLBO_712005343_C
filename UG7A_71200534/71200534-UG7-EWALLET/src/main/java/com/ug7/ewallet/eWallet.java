package com.ug7.ewallet;

public class eWallet {
    private User user;
    private int Saldo;

    public eWallet(User user) {
        this.user = user;
    }

    public void setSaldo(int saldo) {
        Saldo = saldo;
    }

    public User getUser() {
        return user;
    }

    public int getSaldo() {
        return Saldo;
    }

    public String topup(int jumlah){
        return "";
    }

    public void transfer(eWallet eWallet, int jumlah){
        if(user.isEmailConfirmed()==true){

        }
    }

    public void withdraw(int jumlah){
        this.Saldo=this.Saldo-jumlah;
    }

    public void getInfo(){
        System.out.println(getUser());
        System.out.println(getSaldo());
    }
}
