package com.arif.Modul2.No1;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*String nama;
        int tahunBerdiri;
        String stadion;
        int juaraUcl;
        String deskripsi;
        String name;
        //int repeat = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            if (repeat == 5) {
                break;
            }

            System.out.print("Input\t: ");
            name = scan.next();

            System.out.println("Name\t= " + name);

            repeat = repeat + 1;
        }

        System.out.println("Masukan Nama Team\t: " );*/

        Club hunter = new Club();
        Club mancesterunited = new Club("Mancester United");
        Club persija = new Club("Persija", "Macan Kemayoran");
        Club semenpadang = new Club("Semen Padang", 1984, "Agus Salim");
        Club darkbrotherhood = new Club("Persib", 1933, "Bandung Lautan Api", 2, "Maung Bandung");

        hunter.getTeam();
        System.out.println();

        mancesterunited.getTeam();
        System.out.println();

        persija.getTeam();
        System.out.println();

        semenpadang.getTeam();
        System.out.println();

        darkbrotherhood.getTeam();
        System.out.println();

    }
}
