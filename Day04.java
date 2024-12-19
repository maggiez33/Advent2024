


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day04 {
    public static void main(String[] args) {



        ArrayList<String> fileData = getFileData("src/x.txt");
        String[][] wordarr = new String[fileData.size()][fileData.get(0).length()];
        for (int i = 0; i < fileData.size(); i++) {
            for (int j = 0; j < fileData.get(0).length(); j++) {
                wordarr[i][j] = fileData.get(i).substring(j, j + 1);

            }
        }
        System.out.println(fileData);
        int count = 0;

        for (int row = 0; row < fileData.size(); row++) {
            for (int col = 0; col < fileData.get(row).length(); col++) {
                if (wordarr[row][col].equals("X")) {

                    if (col < fileData.get(row).length() - 3 && row > 2 && wordarr[row - 1][col + 1].equals("M")) {
                        if (wordarr[row - 2][col + 2].equals("A") && wordarr[row - 3][col + 3].equals("S")) {
                            count++;
                            //up-right
                            System.out.print(row);
                            System.out.println(col + " ur");
                        }
                    }
                    if (col > 2 && row > 2 && wordarr[row - 1][col - 1].equals("M")) {
                        if (wordarr[row - 2][col - 2].equals("A") && wordarr[row - 3][col - 3].equals("S")) {
                            count++;
                            //up-left
                            System.out.print(row);
                            System.out.println(col + " ul");
                        }
                    }
                    if (col < fileData.get(row).length() - 3 && row < fileData.size() - 3 && wordarr[row + 1][col + 1].equals("M")) {
                        if (wordarr[row + 2][col + 2].equals("A") && wordarr[row + 3][col + 3].equals("S")) {
                            count++;
                            //down-right
                            System.out.print(row);
                            System.out.println(col + " dr");
                        }
                    }
                    if (col > 2 && row < fileData.size() - 3 && wordarr[row + 1][col - 1].equals("M")) {
                        if (wordarr[row + 2][col - 2].equals("A") && wordarr[row + 3][col - 3].equals("S")) {
                            count++;
                            //down-left
                            System.out.print(row);
                            System.out.println(col + " dl");
                        }
                    }
                    if (col < fileData.get(row).length() - 3 && wordarr[row][col + 1].equals("M")) {
                        if (wordarr[row][col + 2].equals("A") && wordarr[row][col + 3].equals("S")) {
                            count++;
                            //right
                            System.out.print(row);
                            System.out.println(col + " right");
                        }
                    }
                    if (col > 2 && wordarr[row][col - 1].equals("M")) {
                        if (wordarr[row][col - 2].equals("A") && wordarr[row][col - 3].equals("S")) {
                            count++;
                            //left
                            System.out.print(row);
                            System.out.println(col + " left");
                        }
                    }
                    if (row > 2 && wordarr[row - 1][col].equals("M")) {
                        if (wordarr[row - 2][col].equals("A") && wordarr[row - 3][col].equals("S")) {
                            count++;
                            //up
                            System.out.print(row);
                            System.out.println(col + " up");
                        }
                    }
                    if (row < fileData.size() - 3 && wordarr[row + 1][col].equals("M") ) {
                        if (wordarr[row + 2][col].equals("A") && wordarr[row + 3][col].equals("S")) {
                            count++;
                            //down
                            System.out.print(row);
                            System.out.println(col + " down");
                        }
                    }
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
