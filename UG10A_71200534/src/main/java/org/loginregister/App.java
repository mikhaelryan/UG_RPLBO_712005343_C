package org.loginregister;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws UsernameException {
        System.out.println( "Selamat datangn di toko namakamu\nsilahkan daftarkan diri kamu untuk dapat mengakses menu di toko namakamu\n" );
        boolean x = true;
        while (x==true){
            Scanner obj=new Scanner(System.in);
            System.out.println("username: ");
            String username = obj.nextLine();
            try {
                if (username.isEmpty()) {
                    throw new UsernameException(2);
                } else if (username.length() < 6) {
                    throw new UsernameException(1);
                }
            }catch(Exception e){
                System.out.println("error");
            }

            System.out.println("email: ");
            String email = obj.nextLine();

            try{
                if (email.isEmpty()){
                    throw new EmailException(1);
                }
            }catch(Exception e){
                System.out.println("error");
            }
            System.out.println("password: ");
            String password = obj.nextLine();
            User user1 = new User(username,email,password);
            x=false;
        }
    }
}
