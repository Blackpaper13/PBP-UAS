package com.calvindo.aldi.sutanto.tubes.UnitTesting;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.calvindo.aldi.sutanto.tubes.Database.KostClientAccess;
import com.calvindo.aldi.sutanto.tubes.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class TambahKostActivity extends AppCompatActivity implements TambahKostView {
    private ImageButton back;
    private MaterialButton btnCreate;
    private TextInputEditText etNama, etHarga, etLongitude, etLatitude, etLokasi, etURLGambar;
    private TambahKostPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tambah_kost);

//        Init layout
        back = findViewById(R.id.back);
        etNama = findViewById(R.id.etNamaKost);
        etHarga = findViewById(R.id.etHargaSewa);
        etLongitude = findViewById(R.id.etLongitude);
        etLatitude = findViewById(R.id.etLatitude);
        etLokasi = findViewById(R.id.etLokasi);
        etURLGambar = findViewById(R.id.etURLGambar);
        btnCreate = findViewById(R.id.btnSave);
        presenter = new TambahKostPresenter(this, new TambahKostService());

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onTambahClicked();
            }
        });
    }


    @Override
    public String getNama() {
        return etNama.getText().toString();
    }

    @Override
    public void showNamaError(String message) {
        etNama.setError(message);
    }

    @Override
    public String getAlamat() {
        return etLokasi.getText().toString();
    }

    @Override
    public void showAlamatError(String message) {
        etLokasi.setError(message);
    }

    @Override
    public String getLongitude() {
        return etLongitude.getText().toString();
    }

    @Override
    public void showLongitudeError() {

    }

    @Override
    public String getLatitude() {
        return etLatitude.getText().toString();
    }

    @Override
    public void showLatitudeError() {

    }

    @Override
    public String gethargaSewa() {
        return etHarga.getText().toString();
    }

    @Override
    public void showHargaSewaError() {

    }

    @Override
    public String getGambar() {
        return etURLGambar.getText().toString();
    }

    @Override
    public void showGambarError() {

    }

    @Override
    public void startMainActivity() {
        new ActivityUtil(this).startMainActivity();
    }

    @Override
    public void startUserProfileActivity(KostClientAccess user) {
            new ActivityUtil(this).startUserProfile(user);
    }

    @Override
    public void showTambahKostError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showErrorRespoonse(String message) {
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}