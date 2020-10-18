package Com.Arif.Modul2.Polimofisme;

public class Lagu {
    public String judul;
    public  String pencipta;

    //Overloding
    public Lagu (String judul) {
        this.judul = judul;
    }

    //overloding
    public Lagu(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    public void getDataLagu(){
        System.out.println("Judul\t : " + judul);
        System.out.println("Pencipta\t : " + pencipta);
        System.out.println();
    }
}
