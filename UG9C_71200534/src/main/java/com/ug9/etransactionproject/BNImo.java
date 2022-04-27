package com.ug9.etransactionproject;

public class BNImo extends MobileBanking{
    public BNImo(String nama, long saldo, String noRekening){
        super(nama,saldo,noRekening);
    }

    public void transfer(DigitalPayment dp, long nominal){
        if(dp instanceof BRImo){
            super.setCheckFee(true);
        }if (nominal<0){
            System.out.println("input tidak valid");
        }else if(super.getSaldo()<nominal){
            System.out.println("transfer gagal! saldo anda tidak mencukupi");
        }else if(super.isCheckFee()==true){
            super.setSaldo(super.getSaldo()-(super.getFeeAntarBank()+nominal));
            dp.setSaldo(dp.getSaldo()+nominal);
            printBuktiTransfer(dp,nominal);
        }
    }
}
