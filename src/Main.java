import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File dataset = new File("src/Dataset/testset");
            Scanner scanner = new Scanner(dataset);

            int sum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int firstDigit = -1;
                int lastDigit = -1;

                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (Character.isDigit(c)) {
                        int number = Integer.parseInt(String.valueOf(c));
                        if(firstDigit == -1) {
                            firstDigit = number;
                        }
                        lastDigit = number;
                    }
                }

                if (firstDigit != -1) {
                    System.out.println("First digit in \"" + line + "\": " + firstDigit);
                } else {
                    System.out.println("No digit found in \"" + line + "\".");
                }

                if (lastDigit != -1) {
                    System.out.println("Last digit in \"" + line + "\": " + lastDigit);
                } else {
                    System.out.println("No digit found in \"" + line + "\".");
                }

                int calibration = firstDigit + lastDigit;
                sum += calibration;
            }
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.toString());
        }


    }
}