
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day02Part2 {
    public static void main(String[] args) {

        ArrayList<String> fileData = getFileData("src/Day2Input.txt");
        int safeReports = 0;

        for (int i = 0; i < fileData.size(); i++) {
            String[] report = fileData.get(i).split(" ");
            ArrayList<Integer> reportNums = new ArrayList<Integer>();
            for (int number = 0; number < report.length; number++) {
                reportNums.add(Integer.parseInt(report[number]));
            }
            boolean safe = true;
            boolean inc = true;
            boolean dec = false;
            int errors = 0;

            if (reportNums.get(0) > reportNums.get(1)) {
                inc = false;
                dec = true;
            }
            if (inc) {
                for (int j = 1; j < reportNums.size(); j++) {
                    int difference = reportNums.get(j) - reportNums.get(j - 1);
                    if (difference < 1 || difference > 3) {
                        errors++;
                        System.out.println(errors);
                        if (errors > 1) {
                            safe = false;
                        }
                    }
                }
            }
            if (dec) {
                for (int j = 1; j < reportNums.size(); j++) {
                    int difference = reportNums.get(j - 1) - reportNums.get(j);
                    if (difference < 1 || difference > 3) {
                        errors++;
                        if (errors > 1) {
                            safe = false;
                        }
                    }
                }
            }
            if (safe) {
                safeReports++;
            }
        }
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
