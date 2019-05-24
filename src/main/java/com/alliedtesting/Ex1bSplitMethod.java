package com.alliedtesting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex1bSplitMethod {
    public static void main(String[] args) {

        String csvFile = "PracticeCSV/ex1aOpenCSV.csv";
        String line = "";
        String csvSplitBy = " ";
        int HeaderOfFie = 0 ;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null)  {

                if(HeaderOfFie >0) {
                    HeaderOfFie++;

                    // use space as separator
                    String[] Student = line.split(csvSplitBy);

                    System.out.println("Student [Name= " + Student[0] + " , Points=" + Student[1] + "]");
                }
                HeaderOfFie++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
