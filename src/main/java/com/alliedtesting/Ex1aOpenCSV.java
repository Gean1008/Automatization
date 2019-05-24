package com.alliedtesting;

    // Java program to illustrate
// for Writing Data in CSV file
import java.io.*;
import java.util.*;
import com.opencsv.CSVWriter;

    public class Ex1aOpenCSV {
        private static final  String FILEPATH = "PracticeCSV/ex1aOpenCSV.csv";

        public static void main(String[] args) {



            // first create file object for file placed at location
            // specified by filepath
            File file = new File(FILEPATH);
            try {
                // create FileWriter object with file as parameter
//            FileWriter outputfile = new FileWriter(file);

                // create CSVWriter object filewriter object as parameter
                CSVWriter writer = new CSVWriter(new FileWriter(file), ' ',
                        CSVWriter.NO_QUOTE_CHARACTER,
                        CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                        CSVWriter.DEFAULT_LINE_END);
                // adding header to csv
                String[] header = { "Name", "Points", "Age" };
                writer.writeNext(header);

                // add data to csv
                String[] data1 = { "Anna", "100" ,"18"};
                writer.writeNext(data1);
                String[] data2 = { "Sergei", "120", "20" };
                writer.writeNext(data2);
                String[] data3 = { "Peter", "110", "19" };
                writer.writeNext(data3);
                String[] data4 = { "Eugene", "125", "20"};
                writer.writeNext(data4);
                String[] data5 = { "Alexandr", "105", "15" };
                writer.writeNext(data5);


                // closing writer connection
                writer.close();
            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

            }

        }

}
