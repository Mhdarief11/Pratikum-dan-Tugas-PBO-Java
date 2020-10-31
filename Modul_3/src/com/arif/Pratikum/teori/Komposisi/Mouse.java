package com.arif.Pratikum.teori.Komposisi;

public class Mouse {
    private String merek,dpi;

    public Mouse(String merek, String dpi) {
        this.merek = merek;
        this.dpi = dpi;
    }
    public void PrintSpec(){
        System.out.println("- Merek\t: "+merek);
        System.out.println("- DPI\t: "+dpi);
        System.out.println();
    }
}
