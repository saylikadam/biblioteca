package com.twu.biblioteca;

/**
 * Created by saylik on 3/25/2015.
 */
public class Login {

    private String loginPath;

    public Login(String loginPath) {

        this.loginPath = loginPath;
    }

    public boolean checkLogin(String id, String password) {
        FileScanner fs = new FileScanner(loginPath);
        String Content = fs.read();
        String []Lines = Content.split("\r\n");
        String idPassword =  id+","+password;
        for (String line : Lines) {
            if(line.equals(idPassword)) {
                return true;
            }
        }
        return false;
    }
}
