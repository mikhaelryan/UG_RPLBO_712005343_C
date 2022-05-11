package org.loginregister;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordException extends User{
    public PasswordException(String username, String email, String password) {
        super(username, email, password);
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

    public boolean konfirmasipassword(String konfirmasi){
        if (konfirmasi!=super.getPassword()){
            return false;
        }else{
            return true;
        }
    }

    public void checkpassword(){
            if ((super.getPassword().length()) < 7) {
                throw new ArithmeticException("Minimal 7 digit");
            }
            if (check(super.getPassword())){
                throw new ArithmeticException("Password minimal harus\n" +
                        "mengandung 1 karakter huruf\n" +
                        "kecil, huruf besar, simbol, dan\n" +
                        "angka");
            }
            if(super.getPassword()==super.getUsername()){
                throw new ArithmeticException("password tidak boleh sama dengan username");
            }

    }
}
