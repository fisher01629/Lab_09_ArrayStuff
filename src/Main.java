import java.util.Random;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double dataAverage;
        int [] dataPoints = new int[100];
        boolean found = false;
        int minValue = 0;
        int maxValue = 0;


        for(int i = 0; i<dataPoints.length;i++){
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        for (int i = 0; i<dataPoints.length; i++){
            sum += dataPoints[i];
        }
        dataAverage = sum / dataPoints.length;
        System.out.println("\nThe sume of the data points is " + sum);
        System.out.println("The average of the data points is " + dataAverage);
        int value = SafeInput.getRangedInt(in, "Enter a number between 1 and 100", 1, 100);
        System.out.println("The value you entered is " + value);
        for(int i = 0; i<dataPoints.length;i++){
            if(dataPoints[i] == value)
                count += 1;
        }
        System.out.println("Your value, " + value + " was found " + count + " times in this set.");
        value = SafeInput.getRangedInt(in, "Enter a number between 1 and 100", 1, 100);
        System.out.println("The value you entered is " + value);
        for(int i = 0; i<dataPoints.length;i++){
            if (dataPoints[i] == value) {
                System.out.println("Your value, " + value + " was found at array index " + i + " in this set.");
                found = true;
                break;
            }
        }if(!found)
        {
            System.out.println("Your value, " + value + " was not found in this set.");
        }
        for (int i = 0; i < dataPoints.length; i++){
            if(minValue > dataPoints[i]){
                minValue = dataPoints[i];
            }
            if(maxValue < dataPoints[i]){
                maxValue = dataPoints[i];
            }
        }


        System.out.println("The minimum value is " + minValue + " and the maximum value is " + maxValue + ".");
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[]){
        double sum = 0;
        for(int i = 0; i<values.length;i++){
            sum += values[i];
        }
        return sum / values.length;
    }
}
