package com.arif.Modul2.No3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        String nama, status;
        int semester;

        System.out.print("Nama Mahasiswa\t: ");
        nama = bfr.readLine();

        System.out.print("Status Mahasiswa\t: ");
        status = bfr.readLine();

        System.out.print("Semester\t: ");
        semester = Integer.parseInt(bfr.readLine());

        Mahasiswa mhs = new Mahasiswa(nama, status, semester);
        mhs.getStatus();
        System.out.println();

        String namaPacar;
        String lamaHubungan;

        System.out.print("Nama Pacar\t: ");
        namaPacar = bfr.readLine();

        System.out.print("Lama Hubungan\t: ");
        lamaHubungan = bfr.readLine();

        Mahasiswa pcr = new Pacar(nama, status, semester, namaPacar, lamaHubungan);
        pcr.getStatus();
    }
}
