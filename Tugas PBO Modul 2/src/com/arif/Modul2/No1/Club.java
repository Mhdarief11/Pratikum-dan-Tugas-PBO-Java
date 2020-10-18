package com.arif.Modul2.No1;

public class Club {
    public String nama;
    public int tahunBerdiri;
    public String stadion;
    public int juaraUcl;
    public String deskripsi;

    public Club() {}

    public Club(String nama) {

        this.nama = nama;
    }

    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    public void getTeam() {
        if (nama == null) {
            System.out.println("Nama Team\t\t: test1");
        } else {
            System.out.println("Nama Team\t\t: " + nama);
        }

        if (deskripsi == null) {
            System.out.println("Deskripsi Team\t: test2");
        } else {
            System.out.println("Deskripsi Team\t: " + deskripsi);
        }

        if (tahunBerdiri == 0) {
            System.out.println("Tahun Berdiri\t: test3");
        } else {
            System.out.println("Tahun Berdiri\t: " + tahunBerdiri);
        }

        if (stadion == null) {
            System.out.println("Stadion Team\t: test4");
        } else {
            System.out.println("Stadion Team\t: " + stadion);
        }

        if (juaraUcl == 0) {
            System.out.println("Juara UCL\t\t: test5");
        } else {
            System.out.println("Juara UCL\t\t: " + juaraUcl);
        }
    }
}
