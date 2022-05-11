package org.loginregister;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordException extends Exception{
    private int code;
    private String message;
    public PasswordException(int code){
        super();
        this.code=code;
        if (code==1) {
            this.message="minimal 7 digit";
        }else if(code==2){
            this.message="Password minimal harus\n" +
                    "mengandung 1 karakter huruf\n" +
                    "kecil, huruf besar, simbol, dan\n" +
                    "angka";
        }else if(code==3){
            this.message="password tidak boleh sama dengan username";
        }
    }

    public boolean check(String password){
        Pattern pattern = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher matchsymbol = pattern.matcher(password);
        boolean upper = false;
        boolean lower = false;
        boolean number = false;
        boolean simbol = false;
        for (int i=0;i<password.length();i++){
            if(Character.isDigit(password.charAt(i))){
                number=true;
            }else if (Character.isUpperCase(password.charAt(i))){
                upper= true;
            }else if (Character.isLowerCase(password.charAt(i))){
                lower=true;
            }else if(matchsymbol.matches()){
                simbol=true;
            }
        }if(upper==true && lower ==true && simbol==true && number==true){
            return true;
        }else{
            return false;
        }
    }

}
