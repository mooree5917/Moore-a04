/*
 UCF COP3330 Fall 2021 Assignment Solutions
 Copyright 2021 Eric Moore
 Sometimes data comes in as a structured format that you have to break down and turn into records so you can process them.
 CSV, or comma-separated values, is a common standard for doing this.
 Construct a program that reads in the following data file (you will need to create this data file yourself;
 name it `exercise42_input.txt`):
 Write your own code to parse the data. Don't use a CSV parser.
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class solution42 {

    //create a method that creates the table header.

    //create a method that spaces out the last name, first name, and salary.

    public static void main(String[] args) {
        //To try and find the file.
        try {
            File Obj = new File("Data/exercise42_input.txt");
            Scanner myReader = new Scanner(Obj);
            //perform a while loop to go through the inputs and then output them like a table. (In progress.)
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            //If no file can be found.
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
