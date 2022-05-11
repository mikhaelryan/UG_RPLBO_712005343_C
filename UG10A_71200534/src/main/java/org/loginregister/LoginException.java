package org.loginregister;

public class LoginException extends User{
    private String usernameLogin;
    private String passwordLogin;

    public LoginException(String username, String email, String password) {
        super(username, email, password);
    }

    public void checklogin(){
        if(usernameLogin==null){
            throw new ArithmeticException("username tidak boleh kosong");
        }else if(passwordLogin==null){
            throw new ArithmeticException("password tidak boleh kosong");
        }else if(usernameLogin!=super.getUsername() || passwordLogin!=super.getPassword()){
            throw new ArithmeticException("username dan pasword tidak valid");
        }
    }
}
