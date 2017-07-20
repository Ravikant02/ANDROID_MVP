package com.example.ravikant.mvp;

/**
 * Created by ravikant on 20/7/17.
 */

public class LoginPresenter {

    private LoginView loginView;

    public LoginPresenter(LoginView loginView){
        this.loginView = loginView;
    }

    public void doLogin(final String userName, final String pass){
        if (userName.isEmpty()){
            loginView.onError("Please check user name!");
            return;
        }

        if (pass.isEmpty()){
            loginView.onError("Please check password!");
            return;
        }

        if (userName.isEmpty() && pass.isEmpty()){
            loginView.onError("Please check user name and password!");
            return;
        }

        if (userName.equalsIgnoreCase("ravi") && pass.equalsIgnoreCase("ravi")){
            loginView.onLoginSuccess("Login Success");
            return;
        }

        loginView.onError("Invalid user name and password");

    }
}
