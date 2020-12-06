package com.calvindo.aldi.sutanto.tubes.UnitTesting;

import com.calvindo.aldi.sutanto.tubes.models.User;

public interface EditView {
    String getEmail();
    void showEmailError(String message);

    String getNama();
    void showNamaError(String message);

    String getUsername();
    void showUsernameError(String message);

    String getNoTelp();
    void showNoTelpError(String message);

    String getAlamat();
    void showAlamatError(String message);

    void startMainActivity();

    void startUserProfileActivity(User user);

    void showEditError();

    void showErrorResponse(String message);
}
