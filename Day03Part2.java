

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day03Part2 {
    public static void main(String[] args) {

        ArrayList<String> fileData = getFileData("src/Day3Input.txt");
        ArrayList<String> allMatches = new ArrayList<String>();

        String regex = "mul\\([1-9][0-9]{0,2},[1-9][0-9]{0,2}\\)|do\\(\\)|don't\\(\\)";


        for (int i = 0; i < fileData.size(); i++) {
            Matcher m = Pattern.compile(regex).matcher(fileData.get(i));
            while (m.find()) {
                allMatches.add(m.group());
            }
        }
        System.out.println(allMatches);

        int sum = 0;
        boolean enabled = true;

        for (int i = 0; i < allMatches.size(); i++) {
            if (enabled && !allMatches.get(i).substring(0,1).equals("d")) {
                String line = allMatches.get(i).substring(4, allMatches.get(i).length() - 1);
                String[] nums = line.split(",");
                sum += Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]);
            } else {
                if (allMatches.get(i).equals("don't()")) {
                    enabled = false;
                }
                if(allMatches.get(i).equals("do()")) {
                    enabled = true;
                }
            }

        }
        System.out.println(sum);


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
