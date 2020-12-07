package com.calvindo.aldi.sutanto.tubes.UnitTesting;

import com.calvindo.aldi.sutanto.tubes.API.ApiClient;
import com.calvindo.aldi.sutanto.tubes.API.ApiInterface;
import com.calvindo.aldi.sutanto.tubes.API.KostResponse;
import com.calvindo.aldi.sutanto.tubes.Database.KostClientAccess;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TambahKostService {
    public void TambahKost(final TambahKostView view, String nama, String alamat, String longitude, String latitude, String hargaSewa, String gambar,
                           final TambahKostCallback callback)
    {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<KostResponse> userDAOCall = apiService.createKost(nama,alamat,longitude,latitude,hargaSewa,gambar);
        userDAOCall.enqueue(new Callback<KostResponse>() {
            @Override
            public void onResponse(Call<KostResponse> call, Response<KostResponse> response) {
                if(response.body().getMessage().equalsIgnoreCase("Berhasil Tambah Kost"))
                {
                    callback.onSuccess(true,response.body().getKost().get(0));
                }else{
                    callback.onError();
                    view.showTambahKostError("Tambah Kost Failed");
                }
            }

            @Override
            public void onFailure(Call<KostResponse> call, Throwable t) {
                view.showErrorRespoonse(t.getMessage());
                callback.onError();
            }
        });

    }

    public Boolean getValid(final TambahKostView view,  String nama, String alamat, String longitude, String latitude, String hargaSewa, String gambar)
    {
        final Boolean[] bool = new Boolean[1];
        TambahKost(view, nama, alamat, longitude, latitude, hargaSewa, gambar, new TambahKostCallback() {
            @Override
            public void onSuccess(boolean value, KostClientAccess user) {
                bool[0] = true;
            }

            @Override
            public void onError() {
                bool[0]=false;
            }
        });
        return bool[0];
    }

}
