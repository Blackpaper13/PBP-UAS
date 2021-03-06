package com.calvindo.aldi.sutanto.tubes.API;

import androidx.room.Query;
import androidx.room.Update;

import com.calvindo.aldi.sutanto.tubes.Database.KostClientAccess;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiInterface {
//    @GET("user")
//    Call<UserResponse> getAllUser();
//
//    @POST("login")
//    @FormUrlEncoded
//    Call<UserResponse> loginUser(@Field("email") String email,
//                                 @Field("password") String password);
//
//    @POST("user")
//    @FormUrlEncoded
//    Call<UserResponse> createUser(@Field("nama") String nama,
//                                  @Field("nim") String nim,
//                                  @Field("prodi") String prodi,
//                                  @Field("fakultas") String fakultas,
//                                  @Field("jenis_kelamin") String jenis_kelamin,
//                                  @Field("password") String password);
//
//    @POST("user/update/{id}")
//    @FormUrlEncoded
//    Call<UserResponse> updateUser(@Path("id")String id,
//                                  @Field("nama") String nama,
//                                  @Field("prodi") String prodi,
//                                  @Field("fakultas") String fakultas,
//                                  @Field("jenis_kelamin") String jenis_kelamin,
//                                  @Field("password") String password);
//    @POST("user/delete/{id}")
//    Call<UserResponse> deleteUser(@Path("id")String id);

    @GET("kost")
    Call<KostResponse> getAllKost();

    @POST("kost")
    @FormUrlEncoded
    Call<KostResponse> createKost(@Field("nama_kost") String nama,
                                  @Field("alamat") String alamat,
                                  @Field("longitude") String longitude,
                                  @Field("latitude") String latitude,
                                  @Field("harga_sewa") String harga_sewa,
                                  @Field("gambar") String gambar);
//
    @PUT("kost/{id}")
    @FormUrlEncoded
    Call<KostResponse> updateKost(@Path("id")String id,
                                  @Field("nama_kost") String nama,
                                  @Field("alamat") String alamat,
                                  @Field("longitude") String longitude,
                                  @Field("latitude") String latitude,
                                  @Field("harga_sewa") String harga_sewa,
                                  @Field("gambar") String gambar);
    @DELETE("kost/{id}")
    Call<KostResponse> deleteKost(@Path("id")String id);
}
