/*
 UCF COP3330 Fall 2021 Assignment Solutions
 Copyright 2021 Eric Moore
 Alphabetizing the contents of a file, or sorting its contents,
 is a great way to get comfortable manipulating a file in your program.
 Create a program that reads in the following list of names from a file called `exercise41_input.txt`
 and sorts the list alphabetically:
 Don't hard-code the number of names.

 */

package baseline;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class solution41{

    void sortTextFile(String fileName, String toFileName) throws IOException{
        //checks the input file
        Path path = Paths.get(fileName);
        Charset charset = StandardCharsets.UTF_8;

        //reads the input file
        List<String> lines = Files.readAllLines(path, charset);
        Collections.sort(lines);

        //writes the new output file
        Path toPath = Paths.get(toFileName);
        Files.write(toPath, lines, charset);
    }

    /*
    To add clarity. I made a Data directory on the same level as build, gradle, src, etc.(I just right-clicked
    on the exercise and made a new directory.) I then right-clicked on the data folder named it our input.txt
    and finally entered whatever data as the input.
     */
    public static void main(String[] args) throws IOException{
        //This is where the program will search then write a new updated file. Please change the...
        //...file path to meet where your input file is located.
        new solution41().sortTextFile("Data/exercise41_input.txt",
                "C:\\Users\\pvtry\\Documents\\COP3330\\Moore-a04\\exercise41\\Data");
    }
}
