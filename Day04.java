
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day04 {
    public static void main(String[] args) {

        ArrayList<String> fileData = getFileData("src/Day4Input.txt");
        String[][] wordarr = new String[fileData.size()][fileData.get(0).length()];
        for (int i = 0; i < fileData.size(); i++) {
            for (int j = 0; j < fileData.get(0).length(); j++) {
                wordarr[i][j] = fileData.get(i).substring(j, j + 1);

            }
        }
        //System.out.println(fileData);
        int count = 0;

        for (int row = 0; row < fileData.size(); row++) {
            for (int col = 0; col < fileData.get(row).length(); col++) {
                if (wordarr[row][col].equals("X")) {
                    if (col < fileData.get(row).length() - 3 && wordarr[row][col + 1].equals("M")) {
                        if (wordarr[row][col + 2].equals("A") && wordarr[row][col + 3].equals("S")) {
                            count++;
                        }
                    } else if (col > 3)
                }
            }
        }
        System.out.println(count);

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