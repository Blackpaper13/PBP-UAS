package com.calvindo.aldi.sutanto.tubes.UnitTesting;


import com.calvindo.aldi.sutanto.tubes.models.User;

public interface EditCallback {
    void onSuccess(boolean value, User user);
    void onError();
}
