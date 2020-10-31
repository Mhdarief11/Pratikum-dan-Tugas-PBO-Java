package com.arif.Pratikum.tugas.Komposisi;

import java.util.ArrayList;

// Class DemoKeluarga
public class DemoKeluarga {
    public static void main(String[] args) {
        // Insiasi objek keluarga
        Keluarga keluarga = new Keluarga("Keluarga Buyung", "Jambi");

        // Deklarasi ArrayList Anak
        ArrayList<Anak> anakList = new ArrayList<>();

        // Memanggil method addAnggotaKeluarga dan menginisiasi data ayah, ibu, dan anak
        keluarga.addAnggotaKeluarga(new Ayah(1, "Jamet", 50),
                new Ibu(2, "Supiak", 45),
                anakList);
        // Menambahkan objek anak kedalam anakList
        anakList.add(new Anak(3, "Encep", 20,"Anak Kandung"));
        anakList.add(new Anak(4, "Gilang", 16,"Anak Kandung"));

        // Memanggil method getDataKeluarga output program
        keluarga.getDataKeluarga();
    }
}
