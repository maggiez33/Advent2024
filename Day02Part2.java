import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day02Part2 {
    public static void main(String[] args) {

        ArrayList<String> fileData = getFileData("src/Day2Input.txt");
        int safeReports = 0;
        int count = 0;
        for (int i = 0; i < fileData.size(); i++) {
            String[] report = fileData.get(i).split(" ");
            ArrayList<Integer> reportNums = new ArrayList<Integer>();
            for (int numbers = 0; numbers < report.length; numbers++) {
                reportNums.add(Integer.parseInt())
            }
            boolean safe = true;
            boolean inc = true;
            boolean dec = false;
            int errors = 0;

            if (Integer.parseInt(report[0]) > Integer.parseInt(report[1])) {
                inc = false;
                dec = true;
            }
            if (inc) {
                for (int j = 1; j < report.length; j++) {
                    int difference = Integer.parseInt(report[j]) - Integer.parseInt(report[j - 1]);
                    if (difference < 1 || difference > 3) {
                        errors++;
                    }
                    if (errors > 1) {
                        System.out.println(fileData.get(i));
                        System.out.println(errors);
                        count++;
                        safe = false;
                    }
                }
            }
            if (dec) {
                for (int j = 1; j < report.length; j++) {
                    int difference = Integer.parseInt(report[j - 1]) - Integer.parseInt(report[j]);
                    if (difference < 1 || difference > 3) {
                        errors++;
                    }
                    if (errors > 1) {
                        System.out.println(fileData.get(i));
                        System.out.println(errors);
                        count++;
                        safe = false;
                    }
                }
            }
            if (safe) {
                safeReports++;
            }
        }
        System.out.println(count);
        System.out.println(safeReports);

    }
//356-383

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
