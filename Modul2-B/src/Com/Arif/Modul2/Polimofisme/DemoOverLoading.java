package Com.Arif.Modul2.Polimofisme;

public class DemoOverLoading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Halu");
        Lagu lagu2 = new Lagu("Cinta" , "Arief");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
