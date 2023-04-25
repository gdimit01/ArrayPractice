import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days' temp?");
        int numDays = scanner.nextInt();
        //initialize array
        int[] temps = new int[numDays];
        // record temps and find the average
        int sum = 0;
        for (int i = 0; i <=numDays; i++) {
            System.out.println("Day " + i + "'s high temp:");
            //each time user enters temp, it is saved into the temp[i] array
            temps[i] = scanner.nextInt();
            sum += temps[i];
        }
        double average = sum / numDays;
        System.out.println();
        System.out.println("Average temp is " + average);
    }    
}
