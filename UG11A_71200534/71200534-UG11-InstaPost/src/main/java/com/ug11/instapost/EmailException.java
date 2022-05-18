package com.ug11.instapost;


public class EmailException extends Exception{
    private String errorMessage;
    private int errorCode;

    public EmailException(int x){
        super();
        this.errorCode=x;
        if(errorCode==1){
            this.errorMessage="Error : Login gagal! Email yang anda  masukan tidak valid";
            System.out.println(this.errorMessage);
        }else if(errorCode==2){
            this.errorMessage="Error : Login gagal! Email anda tidak terdaftar di google";
            System.out.println(this.errorMessage);
        }
    }

    public String getErrorMessage(){
        return this.errorMessage;
    }
}
