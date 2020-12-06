package com.calvindo.aldi.sutanto.tubes.UnitTesting;

import com.calvindo.aldi.sutanto.tubes.Database.UserDAO;

public interface RegisterView   {
    String getNama();
    void showNamaError(String message);

    String getUsername();
    void showUsernameError(String message);

    String getEmail();
    void showEmailError(String message);

    String getAlamat();
    void showAlamatError(String message);

    String getNoTelp();
    void showNoTelpError(String message);

    String getPassword();
    void showPasswordError(String message);

    void startToLogin();

    void startUserProfile(UserDAO user);

    void showRegisterError(String message);

    void showErrorResponse(String message);
}
