package com.example.ravikant.mvp;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ravikant on 20/7/17.
 */

public class LoginUnitTest {


    @Test
    public void checkUserNameIsEmpty(){
        LoginView loginView= mock(LoginView.class);
        LoginPresenter loginPresenter = new LoginPresenter(loginView);
        loginPresenter.doLogin("","ravi");
        verify(loginView).onError("Please check user name!");
    }

    @Test
    public void checkUserPassIsEmpty(){
        LoginView loginView= mock(LoginView.class);
        LoginPresenter loginPresenter = new LoginPresenter(loginView);
        loginPresenter.doLogin("ravi","");
        verify(loginView).onError("Please check password!");
    }

    @Test
    public void checkUserNameAndPassIncorrect(){
        LoginView loginView= mock(LoginView.class);
        LoginPresenter loginPresenter = new LoginPresenter(loginView);
        loginPresenter.doLogin("ravi","fd");
        verify(loginView).onError("Invalid user name and password");
    }

    @Test
    public void checkUserNameAndPassCorrect(){
        LoginView loginView= mock(LoginView.class);
        LoginPresenter loginPresenter = new LoginPresenter(loginView);
        loginPresenter.doLogin("ravi","ravi");
        verify(loginView).onLoginSuccess("Login Success");
    }


}
