import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day03 {
    public static void main(String[] args) {

        ArrayList<String> fileData = getFileData("src/Day3Input.txt");
        ArrayList<String> allMatches = new ArrayList<String>();

        String regex = "mul\\([1-9][0-9]{0,2},[1-9][0-9]{0,2}\\)";

        for (int i = 0; i < fileData.size(); i++) {
            Matcher m = Pattern.compile(regex).matcher(fileData.get(i));
            while (m.find()) {
                allMatches.add(m.group());
            }
        }
        System.out.println(allMatches);
        int sum = 0;
        for (int i = 0; i < allMatches.size(); i++) {

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