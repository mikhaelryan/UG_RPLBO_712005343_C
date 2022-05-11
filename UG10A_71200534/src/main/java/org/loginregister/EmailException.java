package org.loginregister;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailException extends Exception{
    private int code;
    private String message;

    public EmailException(int code){
        super();
        this.code=code;
        if (code==1) {
            this.message="email tidak boleh kosong";
        }else if(code==2){
            this.message="email tidak valid";
        }
    }

    public boolean checkemailvalidation(String email){
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher= pattern.matcher(email);
        return matcher.matches();
    }

}
