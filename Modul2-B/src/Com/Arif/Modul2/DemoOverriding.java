package Com.Arif.Modul2;

public interface DemoOverriding {
    public static void main(String[] args) {
        X supperClass = new X();
        Y subClass = new Y();

        supperClass.getValue("Mati Listrik");
        subClass.getValue("Mati Lampu");
    }
}
