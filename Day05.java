

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day05 {
    public static void main(String[] args) {

        ArrayList<String> fileData = getFileData("src/Day5Input.txt");
        System.out.println(fileData.size());

        ArrayList<String> rules = new ArrayList<String>();
        for (int i = 0; i < 1176; i++) {
            String[] r = fileData.get(i).split("\\|");
            rules.add(Arrays.toString(r));
        }
        for (int i = 1176; i < fileData.size(); i++) {
            
        }
        System.out.println(fileData.get(1175));
    }

    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}
