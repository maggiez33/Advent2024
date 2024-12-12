
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
        ArrayList<int[]> ordered = new ArrayList<>();
        ArrayList<int[]> rules = new ArrayList<>();
        ArrayList<int[]> pages = new ArrayList<>();

        for (int i = 0; i < 1176; i++) {
            String[] r = fileData.get(i).split("\\|");
            int[] rc = new int[r.length];
            for (int j = 0; j < r.length; j++) {
                rc[j] = Integer.parseInt(r[j]);
            }
            rules.add(rc);
        }
        for (int i = 1176; i < fileData.size(); i++) {
            String[] p = fileData.get(i).split(",");
            int[] pc = new int[p.length];
            for (int j = 0; j < p.length; j++) {
                pc[j] = Integer.parseInt(p[j]);
            }
            pages.add(pc);
        }

        for (int i = 0; i < pages.size(); i++) {
            boolean safe = false;
            int pidx = 0;
            while (pidx < pages.get(i).length) {
                for (int j = 0; j < rules.size(); j++) {
                    if (pages.get(i)[pidx] == rules.get(j)[0]) {
                        System.out.println(pages.get(i)[pidx]);
                        System.out.println(rules.get(j)[0]);
                        if (Arrays.asList().get(i).)
                    }

                }
                pidx++;
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
