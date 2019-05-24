package com.alliedtesting;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex1aCommonCSV {
    private static final  String FILEPATH = "PracticeCSV/ex1aCommonCSV.csv";
    public static void main(String[] args)  throws IOException {

        {
            File file = new File(FILEPATH);
            try (
                    FileWriter outputfile = new FileWriter(file);


                    CSVPrinter csvPrinter = new CSVPrinter(outputfile , CSVFormat.DEFAULT
                            .withHeader("Name", "Points", "Age" ))
            ) {
                csvPrinter.printRecord("Anna", "100", "18" );
                csvPrinter.printRecord("Sergei", "120", "20");
                csvPrinter.printRecord("Peter", "110", "19");
                csvPrinter.printRecord("Eugene", "125", "20");
                csvPrinter.printRecord("Alexandr", "105", "15");

                csvPrinter.flush();

            }
        }
    }
}
