package com.calvindo.aldi.sutanto.tubes.UnitTesting;

import com.calvindo.aldi.sutanto.tubes.Database.UserDAO;

public interface RegisterCallback {
    void onSuccess(boolean value, UserDAO user);
    void onError();
}
