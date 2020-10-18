package com.arif.tugas1;

public class BiodataKaryawan {
    private static String nama = "Rayhan ALif";
    private static String ttl = "Bogor, 21 November 2000";
    private static String alamat = "Jln. mawar rt01 rw03 jakarta";
    private static String kelamin = "Laki-Laki";
    private static String status = "Belum Kawin";
    private static String riwayat = "S1 Software Engineering";
    private static String email = "Rayhan22@gmail.com";
    private static String nomer = "081256403215";

    public static void main(String[] args) {

        // Output Biodata Karyawan PT Tadika Mesra
        System.out.println("*** Biodata Karyawan PT Maju Sukses ***");
        System.out.println("Nama Lengkap\t\t : " + nama);
        System.out.println("TTL\t\t\t\t\t : " + ttl);
        System.out.println("Alamat\t\t\t\t : " + alamat);
        System.out.println("Jenis Kelamin\t\t : " + kelamin);
        System.out.println("Status Pernikahan\t : " + status);
        System.out.println("Pendidikan Terakhir\t : " + riwayat);
        System.out.println("Email\t\t\t\t : " + email);
        System.out.println("Nomer HP\t\t\t : " + nomer);
    }
}