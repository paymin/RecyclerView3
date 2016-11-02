package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by paymin on 01/11/2016.
 */

public class Hotel implements Serializable {
    public String judul;
    public String deskripsi;
    public String foto;
    public String detail;
    public String lokasi;

    public Hotel(String judul, String deskripsi, String foto, String detail, String lokasi){
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
        this.detail = detail;
        this.lokasi = lokasi;
    }

}
