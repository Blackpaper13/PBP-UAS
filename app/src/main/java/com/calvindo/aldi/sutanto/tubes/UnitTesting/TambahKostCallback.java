package com.calvindo.aldi.sutanto.tubes.UnitTesting;

import com.calvindo.aldi.sutanto.tubes.Database.KostClientAccess;
import com.calvindo.aldi.sutanto.tubes.Database.UserDAO;

public interface TambahKostCallback {
    void onSuccess(boolean value, KostClientAccess user);
    void onError();
}
