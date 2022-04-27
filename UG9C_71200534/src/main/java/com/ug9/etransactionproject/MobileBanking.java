package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment {
    private boolean checkFee = false;
    private long feeAntarBank = 6000;
    private String noRekening;

    public MobileBanking(String x, long saldo, String noRekening) {
        super(x, saldo);
        this.noRekening=noRekening;
    }

    public String getNoRekening(){
        return this.noRekening;
    }

    public boolean isCheckFee() {
        return checkFee;
    }

    public void transfer(DigitalPayment dp, long nominal){
        if (nominal<0){
            System.out.println("input tidak valid");
        }else if(super.getSaldo()<nominal){
            System.out.println("transfer gagal! saldo anda tidak mencukupi");
        }else if(isCheckFee()==true){
            super.setSaldo(super.getSaldo()-(this.feeAntarBank+nominal));
            dp.setSaldo(dp.getSaldo()+nominal);
            printBuktiTransfer(dp,nominal);
        }
    }

    public void setCheckFee(boolean x){
        this.checkFee=x;
    }

    public long getFeeAntarBank() {
        return feeAntarBank;
    }
}
