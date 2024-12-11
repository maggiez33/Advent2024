

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
        ArrayList<String> ordered = new ArrayList<>();
        ArrayList<String> rules = new ArrayList<>();
        ArrayList<String> pages = new ArrayList<>();
        for (int i = 0; i < 1176; i++) {
            String[] r = fileData.get(i).split("\\|");
            rules.add(Arrays.toString(r));
        }
        for (int i = 1176; i < fileData.size(); i++) {
            String[] p = fileData.get(i).split(",");
            pages.add(Arrays.toString(p));
        }

        for (int i = 0; i < pages.size(); i++) {
            System.out.println(pages.get(i).);
            /*
            boolean correct = true;
            for (int j = 0; j < rules.size(); j++) {
                for (int pageidx = 0; pageidx < pages.get(i).length(); pageidx++) {

                }
            }
            if (correct) {
                ordered.add(pages.get(i));
            }
            */
        }
        /*
        int sum = 0;
        for (int i = 0; i < ordered.size(); i++) {

        }

        System.out.println(sum);

         */
        System.out.println(rules.get(0));
        System.out.println(rules.getLast());
        System.out.println(pages.get(0));
        System.out.println(pages.getLast());
        System.out.println(fileData.get(1175));
    }
    public String[] applyRule
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