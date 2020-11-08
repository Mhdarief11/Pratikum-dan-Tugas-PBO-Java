package com.arif.pratikum;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Try_Catch {
    public static void main(String[] args) {
        File file = new File("D:\\Muhammad Arief Saputra");

        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("Read File Berhasil");
        }catch (FileNotFoundException e) {
            System.out.println("Nggak Ada Filenya! ");
        }

    }
}
