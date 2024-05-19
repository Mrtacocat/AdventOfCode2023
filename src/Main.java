import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Dataset/dataset"));
            int val = 0;
            for (String line : br.lines().toList()) {
                int first = -1;
                int last = -1;
                for (String c : line.split("")) {
                    if (Character.isDigit(c.charAt(0))) {
                        if (first == -1) {
                            first = Integer.parseInt(c);
                        }
                        last = Integer.parseInt(c);
                    }
                }
                first *= 10;
                val += first + last;
            }
            System.out.println(val);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}