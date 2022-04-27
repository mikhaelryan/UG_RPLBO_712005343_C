package com.ug9.etransactionproject;

public class Dana extends MobileWallet{
    public long danaFeeTransferBank = 1000;

    public Dana(String nama, long saldo, String noHp){
        super(nama,saldo,noHp);
    }

    public void transfer(DigitalPayment dp, long nominal){
        if (dp instanceof Ovo){
            System.out.println("akun DANA tidak valid");
        }else{
            super.setFeeTransferBank(this.danaFeeTransferBank);
            if(nominal<0){
                System.out.println("input tidak valid");
            }else if(super.getSaldo()<nominal){
                System.out.println("transfer gagal! saldo anda tidak mencukupi");
            }else if(dp instanceof BNImo || dp instanceof BRImo){
                super.setSaldo(super.getSaldo()-(nominal+super.getFeeTransferBank()));
                dp.setSaldo(dp.getSaldo()+nominal);
                printBuktiTransfer(dp,nominal);
            }else{
                super.setSaldo(getSaldo()-(nominal));
                dp.setSaldo(dp.getSaldo()+nominal);
                printBuktiTransfer(dp,nominal);
            }
        }
    }
}
