package com.ug9.etransactionproject;

public class Ovo extends MobileWallet{
    private long ovoFeeTransferBank = 2000;

    public Ovo(String nama, long saldo, String noHp){
        super(nama, saldo, noHp);
    }

    public void transfer(DigitalPayment dp, long nominal){
        super.setFeeTransferBank(this.ovoFeeTransferBank);
        if(dp instanceof Ovo){
            System.out.println("akun OVO tidak valid");
        }else{
            if(nominal<0){
                System.out.println("input tidak valid");
            }else if(super.getSaldo()<nominal){
                System.out.println("transfer gagal! saldo anda tidak mencukupi");
            }else if(dp instanceof BNImo || dp instanceof BRImo){
                super.setSaldo(super.getSaldo()-(nominal+super.getFeeTransferBank()));
                dp.setSaldo(dp.getSaldo()+nominal);
                printBuktiTransfer(dp,nominal);
            }else{
                super.setSaldo(getSaldo()-(nominal+super.getFeeTransferBank()));
                dp.setSaldo(dp.getSaldo()+nominal);
                printBuktiTransfer(dp,nominal);
            }
        }
    }


}
