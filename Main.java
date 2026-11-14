import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner
  public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            Scanner scanner = new Scanner(file);

            int sum = 0;
            int count = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                sum += number;
                count++;
                min = Math.min(min, number);
                max = Math.max(max, number);
            }

            scanner.close();

            if (count > 0) {
                double average = (double) sum / count;

                System.out.println("Sum: " + sum);
                System.out.println("Average: " + average);
                System.out.println("Minimum: " + min);
                System.out.println("Maximum: " + max);
            } else {
                System.out.println("No numbers found.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
