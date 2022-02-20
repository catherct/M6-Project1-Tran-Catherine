import java.util.Scanner;

public class MonthConverterSwitch {

    public static void main(String[] args) {

        //call scanner to read user input
        Scanner myScanner = new Scanner(System.in);

        //prompt user to enter a number between 1 and 12
        //    I wonder if there is an easier way to organize these months,,
        System.out.println("Please choose one of the following months:");
            System.out.println("\t" + "Press 1 for January");
            System.out.println("\t" + "Press 2 for February");
            System.out.println("\t" + "Press 3 for March");
            System.out.println("\t" + "Press 4 for April");
            System.out.println("\t" + "Press 5 for May");
            System.out.println("\t" + "Press 6 for June");
            System.out.println("\t" + "Press 7 for July");
            System.out.println("\t" + "Press 8 for August");
            System.out.println("\t" + "Press 9 for September");
            System.out.println("\t" + "Press 10 for October");
            System.out.println("\t" + "Press 11 for November");
            System.out.println("\t" + "Press 12 for December");
        String userInput = myScanner.nextLine();

        //convert user input into integer
        int userMonth = Integer.parseInt(userInput);

        //compare userDay to numbers 1 to 12 and print out correct day
        switch (userMonth) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("You have entered an invalid number. " +
                        "You must enter a number between 1 and 12. Goodbye.");
        }

    }
}
