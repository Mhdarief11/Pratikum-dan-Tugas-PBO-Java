package com.arif.Modul2.No3;

public class Pacar extends Mahasiswa {
    public String namaPacar;
    public String lamaHubungan;

    public Pacar(String nama, String status, int semester, String namaPacar, String lamaHubungan) {
        super(nama, status, semester);
        this.namaPacar = namaPacar;
        this.lamaHubungan = lamaHubungan;
    }
}
