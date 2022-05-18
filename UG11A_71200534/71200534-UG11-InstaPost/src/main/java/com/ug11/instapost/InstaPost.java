package com.ug11.instapost;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InstaPost{
    private int totalMention;
    private String email;
    private String username;

    public InstaPost(){

    }

    public void printInfo(){
        System.out.println("Username: "+this.username);
        System.out.println("Email: "+this.email);
        System.out.println("Total Mention: "+this.totalMention);
    }

    public void login(String s) {
        String regex="^(.+)@gmail.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        if(matcher.matches()){
            this.email=s;
            int x=email.indexOf('@');
            String y=null;
            y=s.substring(0,x);
            this.username=y.toUpperCase();
            System.out.println("Login berhasil!");
        }else{
            if(s.indexOf("@")==-1) {
                try {
                    throw new EmailException(1);
                } catch (EmailException e) {

                }
            }else{
                try {
                    throw new EmailException(2);
                } catch (EmailException e) {

                }
            }
        }
    }

    public void post(String s){
        int mention=0;
        String[] arr=s.split(" ",0);
        StringBuilder x=new StringBuilder();
        for (String a:arr){
            String regex="@(.+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(a);
            if(matcher.matches()){
                this.totalMention+=1;
                mention+=1;
                x.append(a);
            }
        }
        System.out.println("Caption: "+s);
        System.out.println("Pengguna yang anda mention: "+x.toString());
        System.out.println("total username yang di mention: "+mention);
    }
}
