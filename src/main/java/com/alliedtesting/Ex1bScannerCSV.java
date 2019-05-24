package com.alliedtesting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1bScannerCSV {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("PracticeCSV/ex1aOpenCSV.csv "));

        scanner.useDelimiter(" ");

        while (scanner.hasNext()){

            System.out.print(scanner.next() + " \t\t " );
        }

        scanner.close();
    }
}
