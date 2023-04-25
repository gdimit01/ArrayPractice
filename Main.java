import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days' temp?");
        int numDays = scanner.nextInt(); // taking the number of days based on this variable
        int[] temps = new int[numDays]; //initialize array
        int sum = 0; // record temps and find the average
        for (int i = 0; i < numDays; i++) { // fix the loop condition
            System.out.println("Day " + (i + 1) + "'s high temp:");
            temps[i] = scanner.nextInt();
            sum += temps[i]; //each time user enters temp, it is saved into the temp[i] array
        }
        double average = sum / (double) numDays; // convert to double to avoid integer division
        int above = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average) {
                above++;
            }
        }

        System.out.println();
        System.out.println("Average temp is " + average);
        System.out.println(above + " days' temps are above average");
    }
}
