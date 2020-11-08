package com.arif.pratikum;

public class Finally {
    public static void main(String[] args) {
        int[] array = new int[5];

        try{
            //Data base di buka
            System.out.println("Akses Elemen ke-5\t : " + array[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            //Exception
            System.out.println("ada Exception Array");
        }finally {
            //data base di tutup
            array[array.length - 1] = 10;
            System.out.println("Nilai elemen terakhir \t : " + array[array.length -1]);
        }
    }
}
