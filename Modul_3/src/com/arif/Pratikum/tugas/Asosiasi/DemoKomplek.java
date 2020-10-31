package com.arif.Pratikum.tugas.Asosiasi;

// Class DemoKomplek
public class DemoKomplek {
    public static void main(String[] args) {
        // Inisiasi objek komplek
        Komplek komplek = new Komplek("Cibubur", "Ayam");

        // Inisiasi objek rumah
        Rumah rumah1 = new Rumah("A-01", "Agus Gunawan", 5);
        Rumah rumah2 = new Rumah("A-06", "Piak Kribo", 4);
        Rumah rumah3 = new Rumah("A-33", "Anwar hamdalah", 6);
        Rumah rumah4 = new Rumah("A-12", "inyong ahamad", 6);
        Rumah rumah5 = new Rumah("A-23", "Bang Jago", 4);

        // Memanggil method addRumah dari objek komplek dengan parameter idRumah
        komplek.addRumah(rumah1.getIdRumah());
        komplek.addRumah(rumah2.getIdRumah());
        komplek.addRumah(rumah3.getIdRumah());
        komplek.addRumah(rumah4.getIdRumah());
        komplek.addRumah(rumah5.getIdRumah());

        // Memanggil method getDataKomplek output program
        komplek.getDataKompek();

    }
}


