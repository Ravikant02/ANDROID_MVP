package com.example.ravikant.mvp;

/**
 * Created by ravikant on 20/7/17.
 */

public interface LoginView {
    void onLoginSuccess(String message);
    void onError(String message);
}
