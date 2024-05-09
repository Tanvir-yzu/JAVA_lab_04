import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> temperatures = new ArrayList<>();
        try {
            File file = new File("weather.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt()) {
                temperatures.add(scanner.nextInt());
            }
            scanner.close();

            System.out.println("Temperatures: " + temperatures.toString());

            double average = temperatures.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            System.out.println("Average temperature: " + average);

            long daysAboveAverage = temperatures.stream().filter(temp -> temp > average).count();
            System.out.println("Number of days above average: " + daysAboveAverage);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}