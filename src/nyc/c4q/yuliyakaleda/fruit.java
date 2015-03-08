package nyc.c4q.yuliyakaleda;

/**
 * Created by olgakoleda on 3/8/15.
 */import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        String color;
        String flavor;

        if (fruit.equals("banana")) {
            color = "pink";
            flavor = "sweet";
        }
        else if (fruit.equals("grapefruit")) {
            color = "pink";
            flavor = "bitter";
        }
        else if (fruit.equals("lemon")) {
            color = "yellow";
            flavor = "sour";
        }
        else {
           System.out.println("I don't know that fruit!");
            return;
        }
        System.out.println("A " + fruit + " is " + color +" and "+ flavor + ".");
    }

}
