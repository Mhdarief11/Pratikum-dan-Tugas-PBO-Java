package com.arif.pratikum;

public class Multi_Try_2 {
    public static void main(String[] args) {
        int [] array = new int [5];

        try{
            array[5] = 30/0;
            System.out.println(array[5]);
            
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("panjang kurang dari 5 !!");
        }catch (ArithmeticException e){
            System.out.println("Jangan Di bagi 0 !!");
        }
    }
}
