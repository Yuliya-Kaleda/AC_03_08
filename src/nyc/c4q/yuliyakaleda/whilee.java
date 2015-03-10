package nyc.c4q.yuliyakaleda;

/**
 * Created by olgakoleda on 3/8/15.
 */
import java.util.Scanner;
public class whilee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x= 10;
        while (x <= 100){
            System.out.println("the number is " + x);
            System.out.println("What is the next number?");
            x = input.nextInt();
        }
    }
}
