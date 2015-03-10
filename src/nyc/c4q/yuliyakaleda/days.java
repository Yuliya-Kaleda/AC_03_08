package nyc.c4q.yuliyakaleda;

/**
 * Access Code 2.1
 * Yuliya Kaleda
 * Days.java
 */
import java.util.Scanner;
public class days {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the month today?");
        String month = input.next();
        System.out.println("What is the day today?");
        int day = input.nextInt();


        if (month.equalsIgnoreCase("January") && day == (1)) {
            System.out.println("Today is New Years Day!");
        }
        else if (month.equalsIgnoreCase("May") && day == (5)) {
            System.out.println("Today is Cinco de Mayo!");
        }
        else if (month.equalsIgnoreCase("July") && day == (4)) {
            System.out.println("Today is July 4!");
        }
        else if (month.equalsIgnoreCase("December") && day ==(25)){
           System.out.println("Today is Christmas!");
        }
        else
            System.out.println("Today is just a regular day!");
    }
}
