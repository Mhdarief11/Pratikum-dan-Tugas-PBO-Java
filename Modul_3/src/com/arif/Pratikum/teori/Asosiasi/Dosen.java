package com.arif.Pratikum.teori.Asosiasi;

public class Dosen {
    private String kodeDosen;
    private int nimMHS[]=new int[10], jmlMahasiswa;

    public Dosen() {
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public int getJmlMahasiswa() {
        return jmlMahasiswa;
    }

    public int getNimMHS(int indeks) {
        return (nimMHS[indeks]);
    }

    public void setNimMHS(int nim){
        nimMHS[jmlMahasiswa]=nim;
        jmlMahasiswa++;
    }

}