import java.util.Scanner;

public class ArrayFunUserArray {

    public static void main(String[] args) {

        //call scanner to read user input
        Scanner myScanner = new Scanner(System.in);

        //declare an array for user input
        int[] fiveNumbers = new int[5];

        //prompt user to enter input
        System.out.println("Please enter five numbers.");

        //use for loop to compile user input into array
        for (int i = 0; i < fiveNumbers.length; i++) {
            String userInput = myScanner.nextLine();
            int userValues = Integer.parseInt(userInput);
            fiveNumbers[i] = userValues;
        }

        //display user input
        System.out.println("\n" + "These were the five numbers you entered.");

        //use enhanced for loop to print input
        for (int x: fiveNumbers) {
            System.out.println(x);
        }

    }
}
