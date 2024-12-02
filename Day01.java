
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

        Collections.sort(left);
        Collections.sort(right);

        for (int i = 0; i < left.size(); i++) {

            total += Math.abs(Integer.parseInt(left.get(i)) - Integer.parseInt(right.get(i)));
        }
        System.out.println(total);
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