package com.arif.Modul2.No2;

public class Burung extends Binatang {
    public String nama;

    public Burung(String nama) {
        this.nama = nama;
    }

    public void getNama() {
        System.out.println("Nama Binatang\t: " + nama);
    }

    public void terbang() {
        System.out.println("Binatang ini bisa terbang");
    }
}
