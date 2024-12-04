
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day02 {
    public static void main(String[] args) {

        ArrayList<String> fileData = getFileData("src/Day2Input.txt");
        int safeReports = 0;

        for (int i = 0; i < fileData.size(); i++) {
            String[] report = fileData.get(i).split(" ");
            boolean safe = true;
            boolean inc = true;
            boolean dec = false;
            if (Integer.parseInt(report[0]) < Integer.parseInt(report[1])) {
                inc = false;
                dec = true;
            }
            for (int j = 1; j < report.length; j++) {
                int num1 = Integer.parseInt(report[j]);
                int num2 = Integer.parseInt(report[j - 1]);
                if (num1 - num2 >= 1 && num1 - num2 <= 3 && safe){

                } else {

                }
            }
        }
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
