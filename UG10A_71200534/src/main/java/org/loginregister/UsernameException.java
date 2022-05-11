package org.loginregister;

public class UsernameException extends Exception {
    private int code;
    private String message;

    public UsernameException(int code) {

        this.code=code;
        if (code==1) {
            this.message="Minimal 6 huruf";
        }else if(code==2){
            this.message="Tidak ada username";
        }
    }


}
