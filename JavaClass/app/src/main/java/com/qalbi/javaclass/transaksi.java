package com.qalbi.javaclass;

import java.util.ArrayList;

/**
 * Created by D2J-00 on 31/01/2017.
 */
public class transaksi {

    private ArrayList<barang> ListBarang = new ArrayList<>();

    public void addBarang(barang Barang){
        this.ListBarang.add(Barang);
    }
    public int totalTransaksi(){
        int hasil=0;
        for(int i=0; i<ListBarang.size(); i++){
            hasil +=ListBarang.get(i).getHarga();
        }
        return hasil;
    }
    public String printTransaksi(){
        String text ="Barang Yang Di Beli Adalah\n";
        text +="-------------------------\n";
        for(int i=0; i<ListBarang.size();i++){
            text += ListBarang.get(i).toString();
        }
        text +="-------------------------\n";
        text +="Total Pembelian : "+totalTransaksi()+"\n";
        text +="Rata Rata : "+averageTransaksi()+"\n";
        text += maxBarang()+"\n";
        text +="-------------------------\n";
        return text;
    }
    public double averageTransaksi(){
        double hasil=0;
        for(int o=0; o<ListBarang.size(); o++){
            hasil = (ListBarang.get(o).getHarga());
        }
        hasil = hasil /ListBarang.size();
        return hasil;
    }
    public String maxBarang(){
        barang max;

        max = ListBarang.get(0);
        for(int i=0; i<ListBarang.size(); i++){
            if(ListBarang.get(i).getHarga() > max.getHarga()){
                max=ListBarang.get(i);
            }
        }

        String namaBarang = max.getNama();
        String text = "Barang termahal pada transaksi ini adalah "+namaBarang;
        return text;
    }
}
