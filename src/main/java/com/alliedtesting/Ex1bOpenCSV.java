package com.alliedtesting;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public class Ex1bOpenCSV {
    public static void main(String[] args) {

        String csvFile = "PracticeCSV/ex1aCommonCSV.csv";
        CSVReader reader = null;


        try {
            reader = new CSVReader(new FileReader(csvFile),',' );
            String[] Student;
            while ((Student = reader.readNext()) != null) {
                System.out.println("Student[Age= " + Student[2] + " , Points= " + Student[1] + " , Name=" + Student[0] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}
