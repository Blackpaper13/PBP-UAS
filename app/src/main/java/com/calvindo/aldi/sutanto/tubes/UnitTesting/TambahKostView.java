package com.calvindo.aldi.sutanto.tubes.UnitTesting;

import com.calvindo.aldi.sutanto.tubes.Database.KostClientAccess;
import com.calvindo.aldi.sutanto.tubes.Database.UserDAO;

public interface TambahKostView {
    String getNama();
    void showNamaError(String message);

    String getAlamat();
    void showAlamatError(String message);

    String getLongitude();
    void showLongitudeError();

    String getLatitude();
    void showLatitudeError();

    String gethargaSewa();
    void showHargaSewaError();

    String getGambar();
    void showGambarError();

    void startMainActivity();

    void startUserProfileActivity(KostClientAccess user);

    void showTambahKostError(String message);

    void showErrorRespoonse(String message);
}
