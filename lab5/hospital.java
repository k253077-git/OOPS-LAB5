package lab5;
import java.util.Scanner;

public class hospital{

    public static void main(String[] args) {

        final int PATIENTS = 5;
        final int DAYS = 7;

        double[][] temp = new double[PATIENTS][DAYS];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperatures for 5 patients for 7 days:");

        for (int i = 0; i < PATIENTS; i++) {
            System.out.println("Patient " + (i + 1) + ":");
            for (int j = 0; j < DAYS; j++) {
                temp[i][j] = sc.nextDouble();
                if (temp[i][j] < 95) {
                    temp[i][j] = 95;
                }
            }
        }

        double highestAverage = 0;
        int highestPatient = 0;
        int fever = 0;
        for (int i = 0; i < PATIENTS; i++) {
            double sum = 0;
            for (int j = 0; j < DAYS; j++) {
                sum += temp[i][j];
                if (temp[i][j] > 100) {
                    fever++;
                }
            }

            double average = sum / DAYS;
            System.out.println("Average temperature of Patient " + (i + 1) + ": " + average);

            if (average > highestAverage) {
                highestAverage = average;
                highestPatient = i + 1;
            }
        }

        System.out.println("\nPatient with highest weekly average: Patient " + highestPatient);
        System.out.println("Highest weekly average temperature: " + highestAverage);
        System.out.println("Number of times temperature exceeded 100°F: " + fever);

        sc.close();
    }
}