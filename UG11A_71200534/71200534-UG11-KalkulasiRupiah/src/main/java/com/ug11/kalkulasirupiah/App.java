package com.ug11.kalkulasirupiah;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class App 
{
    public static void main( String[] args )
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Masukan teks: ");
        String inputan=inp.nextLine();
        String[] arr=inputan.split(" ",0);
        StringBuilder x=new StringBuilder();
        int counter=0;
        int tot=0;
        for (String a:arr){
            String regex="Rp\\d.+(?:\\,\\d+)?";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(a);
            if (matcher.matches()){
                if(counter<1){
                    x.append(a);
                }else{
                    x.append(" + "+a);
                }
                counter+=1;
                String b=a;
                b=b.replace("Rp","");
                b=b.replace(",00","");
                b=b.replace(".","");
                tot+= Integer.parseInt(b);
            }
        }
        System.out.println("Rincian Biaya: "+x.toString());
        System.out.println("Total: "+tot);
    }
}
