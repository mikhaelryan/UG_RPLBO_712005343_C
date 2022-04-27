package com.ug9.etransactionproject;

public class MobileWallet extends DigitalPayment{
    private String noHp;
    private long feeTransferBank;

    public MobileWallet(String nama, long saldo, String noHp){
        super(nama, saldo);
        this.noHp=noHp;
    }

    public void setFeeTransferBank(long feeTransferBank) {
        this.feeTransferBank = feeTransferBank;
    }

    public String getNoHp() {
        return noHp;
    }

    public void transfer(DigitalPayment dp, long nominal){
        if(nominal<0){
            System.out.println("input tidak valid");
        }else if(super.getSaldo()<nominal){
            System.out.println("transfer gagal! saldo anda tidak mencukupi");
        }else if(dp instanceof BNImo || dp instanceof BRImo){
            super.setSaldo(getSaldo()-(nominal+feeTransferBank));
            dp.setSaldo(dp.getSaldo()+nominal);
            printBuktiTransfer(dp,nominal);
        }else{
            super.setSaldo(getSaldo()-(nominal+feeTransferBank));
            dp.setSaldo(dp.getSaldo()+nominal);
            printBuktiTransfer(dp,nominal);
        }
    }

    public long getFeeTransferBank() {
        return feeTransferBank;
    }
}
