
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day01 {
    public static void main(String[] args) {

        ArrayList<String> fileData = getFileData("src/Day1Input.txt");

        int total = 0;
        ArrayList<String> left = new ArrayList<String>();
        ArrayList<String> right = new ArrayList<String>();
        for (int i = 0; i < fileData.size(); i++) {
            left.add(fileData.get(i).split("   ")[0]);
            right.add(fileData.get(i).split("   ")[1]);
        }


        for (int i = 1; i < left.size(); i++) {
            int minLeft = Integer.parseInt(left.get(i));
            for (int j = i; j < left.size(); j++) {
                if (Integer.parseInt(left.get(i - 1)) < minLeft) {
                    minLeft = Integer.parseInt(left.get(i - 1));
                }
            }

            int minRight = Integer.parseInt(left.get(i));
            for (int j = i; j < right.size(); j++) {
                if (Integer.parseInt(right.get(i - 1)) < minRight) {
                    minLeft = Integer.parseInt(right.get(i - 1));
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