package com.qalbi.javaclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String showString;
    public TextView showText;
    public barang [] arraBarang = new barang[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showText = (TextView) findViewById(R.id.show_text);
        showString = "Manipulasi Java Androis";
        addSeparator();


        initBarang();
//        showString+=arraBarang[0].toString();
//        addSeparator();
//        showString+=arraBarang[1].toString();
//        addSeparator();
//        showString+=arraBarang[5].toString();
//        addSeparator();
//        showString+=arraBarang[3].toString();

        transaksi trans1 = new transaksi();
        trans1.addBarang(arraBarang[3]);
        trans1.addBarang(arraBarang[7]);
        trans1.addBarang(arraBarang[1]);
        showString += trans1.printTransaksi();


        showText.setText(showString);;
    }

    public void addSeparator(){
        showString += "\n------------------------------\n";
    }

    public void initBarang(){
        arraBarang[0] = new barang("Laptop",1,7000000);
        arraBarang[1] = new barang("Printer",barang.ELEKTRONIK,2500000);
        arraBarang[2] = new barang("Monitor",barang.ELEKTRONIK,1000000);
        arraBarang[3] = new barang("Scanner",barang.ELEKTRONIK,1500000);
        arraBarang[4] = new barang("Meja",barang.NON_ELEKTRONIK,150000);
        arraBarang[5] = new barang("Kursi",barang.NON_ELEKTRONIK,200000);
        arraBarang[6] = new barang("Lemari",barang.ELEKTRONIK,500000);
        arraBarang[7] = new barang("Headphone",barang.ELEKTRONIK,100000);
        arraBarang[8] = new barang("Soft Case",barang.NON_ELEKTRONIK,750000);
        arraBarang[9] = new barang("Sound System",barang.ELEKTRONIK,5500000);
    }
}