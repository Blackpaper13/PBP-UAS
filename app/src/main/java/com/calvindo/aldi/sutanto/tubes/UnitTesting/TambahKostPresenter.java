package com.calvindo.aldi.sutanto.tubes.UnitTesting;

import com.calvindo.aldi.sutanto.tubes.Database.KostClientAccess;

public class TambahKostPresenter {
    private TambahKostView view;
    private  TambahKostService service;
    private TambahKostCallback callback;

    public TambahKostPresenter(TambahKostView view, TambahKostService service){
        this.view = view;
        this.service=service;
    }

    public void onTambahClicked(){
        if(view.getNama().isEmpty()){
            view.showNamaError("Nama Kost Tidak Boleh Kosong");
            return;
        }else if(view.getAlamat().isEmpty()){
            view.showAlamatError("Alamat Tidak Boleh Kosong");
            return;
        }else if(view.getLongitude().isEmpty()){
            view.showLongitudeError();
            return;
        }else if(view.getLatitude().isEmpty()){
            view.showLatitudeError();
            return;
        }else if(view.gethargaSewa().isEmpty())
        {
            view.showHargaSewaError();
        }
        else if(view.getGambar().isEmpty()){
            view.showGambarError();
            return;
        }else{
            service.TambahKost(view, view.getNama(), view.getAlamat(), view.getLongitude(), view.getLatitude(), view.gethargaSewa(), view.getGambar(), new TambahKostCallback() {
                @Override
                public void onSuccess(boolean value, KostClientAccess user) {
                    if(user.getId().equalsIgnoreCase("0")){
                        view.startMainActivity();
                    }else{
                        view.startUserProfileActivity(user);
                    }
                }

                @Override
                public void onError() {

                }
            });
            return;
        }
    }
}
