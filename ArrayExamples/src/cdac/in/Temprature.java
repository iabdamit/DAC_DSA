package cdac.in;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of days: ");
        
        int numberOfDays = scanner.nextInt();
        
        double[] temperatures = new double[numberOfDays];
        
        for (int i = 0; i < numberOfDays; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }
        
        //! Calculate the average temperature
        double sum = 0;
        for (double temperature : temperatures) {
            sum += temperature;
        }
        double averageTemperature = sum / temperatures.length;
        System.out.println("Average Temprature : "+averageTemperature);
        
        System.out.println("Average Temperature: " + averageTemperature);
        
        int daysAboveAverage = 0;
        for (double temperature : temperatures) {
            if (temperature > averageTemperature) {
                daysAboveAverage++;
            }
        }
        
        System.out.println("Total number of days with temperature above average: " + daysAboveAverage);
        
        scanner.close();
    }
}

