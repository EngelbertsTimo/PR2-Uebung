package u02;

import java.io.*;

import java.util.Scanner;

public class u02 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("source.csv"));
        while (input.hasNext()) {
            String row = input.next();
            if (row.equals("Name;Geburtsjahr;Lieblingsfarbe;Lieblingszahl"))
                continue;
            String[] sParam = row.split(";");

            String out = "";
            System.out.println(out.format("%-14s ist geboren in %4s und liebt %-10s %07.2f", sParam[0], sParam[1],
                    sParam[2], Double.parseDouble(sParam[3].replaceAll(",","." ))));

        }
    }

}
