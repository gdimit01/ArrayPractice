import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days' temp?");
        int numDays = scanner.nextInt(); // taking the number of days based on this variable
        //initialize array
        int[] temps = new int[numDays];
        // record temps and find the average
        int sum = 0;
        for (int i = 0; i <=numDays; i++) {
            System.out.println("Day " + (i+1) + "'s high temp:");
            //each time user enters temp, it is saved into the temp[i] array
            temps[i] = scanner.nextInt();
            sum += temps[i]; //based on that we calculate the sum of temp
        }
        double average = sum / numDays;
        //count days above average
        int above = 0;
        for (int i = 0; i <temps.length; i++) {
            if (temps[i] > average)//if temp is above average
            {
                above++;
            }
            
        }

        System.out.println();
        System.out.println("Average temp is " + average);
        System.out.println(above + " days' temps are above average");
    }    
}
