package com.calvindo.aldi.sutanto.tubes.UnitTesting;

import android.content.Context;
import android.content.Intent;

import com.calvindo.aldi.sutanto.tubes.DashboardActivity;
import com.calvindo.aldi.sutanto.tubes.Database.KostClientAccess;
import com.calvindo.aldi.sutanto.tubes.ListKostActivity;

public class ActivityUtil {
    private Context context;

    public ActivityUtil(Context context){
        this.context = context;
    }

    public void startMainActivity(){
        context.startActivity(new Intent(context, DashboardActivity.class));
    }

    public void startUserProfile(KostClientAccess user){
        Intent i = new Intent(context, ListKostActivity.class);
        i.putExtra("id",user.getId());
        i.putExtra("nama",user.getNama_kost());
        i.putExtra("alamat",user.getAlamat());
        i.putExtra("harga sewa",user.getHarga_sewa());
        i.putExtra("gambar",user.getGambar());
        context.startActivity(i);
    }
}
