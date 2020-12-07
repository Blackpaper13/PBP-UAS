package com.calvindo.aldi.sutanto.tubes.UnitTesting;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TambahKostPresenterTest {
    @Mock
    private TambahKostView view;
    @Mock
    private TambahKostService service;
    private TambahKostPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter=new TambahKostPresenter(view,service);
    }

    @Test
    public void ShouldShowErrorMessageWhenNamaIsEmpty() throws Exception{
        when(view.getNama()).thenReturn("");
        System.out.println("Nama : "+view.getNama());

        presenter.onTambahClicked();
        verify(view).showNamaError("Nama Kost Tidak Boleh Kosong");
    }

    @Test
    public void ShouldShowErrorMessageWhenAlamatIsEmpty() throws Exception{
        when(view.getNama()).thenReturn("Kost Aneh");
        System.out.println("Nama : "+view.getNama());

        when(view.getAlamat()).thenReturn("");
        System.out.println("Alamat : "+view.getAlamat());

        presenter.onTambahClicked();
        verify(view).showAlamatError("Alamat Tidak Boleh Kosong");
    }

    @Test
    public void HarusTampilErrorPesanJikaLongitudeisEmpty() throws Exception{
        when(view.getNama()).thenReturn("Kost Aneh");
        System.out.println("Nama : "+view.getNama());
        when(view.getAlamat()).thenReturn("Jalan Aneh no 1");
        System.out.println("Alamat : "+view.getAlamat());
        when(view.getLongitude()).thenReturn("");
        System.out.println("Longitude : "+view.getLongitude());

        presenter.onTambahClicked();
        verify(view).showLongitudeError();
    }

    @Test
    public void HarusTampilErrorPesanJikaLatitudeisEmpty() throws Exception{
        when(view.getNama()).thenReturn("Kost Aneh");
        System.out.println("Nama : "+view.getNama());
        when(view.getAlamat()).thenReturn("Jalan Aneh no 1");
        System.out.println("Alamat : "+view.getAlamat());
        when(view.getLongitude()).thenReturn("-94.420307");
        System.out.println("Longitude : "+view.getLongitude());
        when(view.getLatitude()).thenReturn("");
        System.out.println("Latitude : "+view.getLatitude());

        presenter.onTambahClicked();
        verify(view).showLatitudeError();
    }

    @Test
    public void HarusTampilErrorPesanJikaHargaSewaisEmpty() throws Exception{
        when(view.getNama()).thenReturn("Kost Aneh");
        System.out.println("Nama : "+view.getNama());
        when(view.getAlamat()).thenReturn("Jalan Aneh no 1");
        System.out.println("Alamat : "+view.getAlamat());
        when(view.getLongitude()).thenReturn("-94.420307");
        System.out.println("Longitude : "+view.getLongitude());
        when(view.getLatitude()).thenReturn("44.968046");
        System.out.println("Latitude : "+view.getLatitude());
        when(view.gethargaSewa()).thenReturn("");
        System.out.println("Harga Sewa :"+view.gethargaSewa());

        presenter.onTambahClicked();
        verify(view).showHargaSewaError();
    }

    @Test
    public void HarusTampilErrorPesanJikaGambarisEmpty() throws Exception{
        when(view.getNama()).thenReturn("Kost Aneh");
        System.out.println("Nama : "+view.getNama());
        when(view.getAlamat()).thenReturn("Jalan Aneh no 1");
        System.out.println("Alamat : "+view.getAlamat());
        when(view.getLongitude()).thenReturn("-94.420307");
        System.out.println("Longitude : "+view.getLongitude());
        when(view.getLatitude()).thenReturn("44.968046");
        System.out.println("Latitude : "+view.getLatitude());
        when(view.gethargaSewa()).thenReturn("450000");
        System.out.println("Harga Sewa :"+view.gethargaSewa());
        when(view.getGambar()).thenReturn("");
        System.out.println("Gambar : "+view.gethargaSewa());

        presenter.onTambahClicked();
        verify(view).showGambarError();
    }

    @Test
    public void HarusTampilErrorPesanJikaTambahKostisValid() throws Exception{
        when(view.getNama()).thenReturn("Kost Aneh");
        System.out.println("Nama : "+view.getNama());
        when(view.getAlamat()).thenReturn("Jalan Aneh no 1");
        System.out.println("Alamat : "+view.getAlamat());
        when(view.getLongitude()).thenReturn("-94.420307");
        System.out.println("Longitude : "+view.getLongitude());
        when(view.getLatitude()).thenReturn("44.968046");
        System.out.println("Latitude : "+view.getLatitude());
        when(view.gethargaSewa()).thenReturn("gambar1.jpg");
        System.out.println("Harga Sewa :"+view.gethargaSewa());
        when(service.getValid(view,view.getNama(),view.getAlamat(),view.getLongitude(),view.getLatitude(),view.gethargaSewa(),view.getGambar())).thenReturn(true);
        System.out.println("Hasil :"+service.getValid(view,view.getNama(),view.getAlamat(),view.getLongitude(),view.getLatitude(),view.gethargaSewa(),view.getGambar()));

        presenter.onTambahClicked();
        //verify(view).showHargaSewaError();
    }


}