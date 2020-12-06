package com.calvindo.aldi.sutanto.tubes.UnitTesting;

import com.calvindo.aldi.sutanto.tubes.API.ApiClient;
import com.calvindo.aldi.sutanto.tubes.API.ApiInterface;
import com.calvindo.aldi.sutanto.tubes.API.UserResponse;

import retrofit2.Call;

public class EditService {
    public void edit(final EditView view, String email,String nama,String username, String notelp, String alamat, final EditCallback callback)
    {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<UserResponse> userCall = apiService
    }
}
