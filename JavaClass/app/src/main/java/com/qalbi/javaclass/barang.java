package com.qalbi.javaclass;

/**
 * Created by D2J-00 on 31/01/2017.
 */
public class barang {
    public static final int ELEKTRONIK = 1;
    public static final int NON_ELEKTRONIK = 2;

    private String nama;
    private  int kategori;
    private int harga;

    public barang(String nama, int kategori, int harga) {
        this.nama = nama;
        this.setKategori(kategori);
        this.harga = harga;
    }

    @Override
    public String toString(){
        return nama+" | "+this.getStringkategori()+" | "+this.harga+"\n";
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public int getKategori() {
        return kategori;
    }
    public String getStringkategori(){
        if(kategori == 1)
            return "electronik";
        else
            return "non elektronik";
    }

    public void setKategori(int kategori) {
        if (kategori != 1 && kategori!=2)
            this.kategori =2;
        else
            this.kategori=kategori;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
