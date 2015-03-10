package nyc.c4q.yuliyakaleda;

/**
 * Created by olgakoleda on 3/8/15.
 */import java.util.Scanner;

public class profession {
    public static void main(String[] args) {
        String profession;
        Scanner input = new Scanner(System.in);

        System.out.println("Guess my profession. Do I carry a sword? Say 'Yes' or 'No'");
        String hasSword = input.next();
        System.out.println("Do I wear a helmet?");
        String wearHelmet = input.next();
        System.out.println("Do I use a shovel?");
        String useShovel = input.next();

        if (hasSword.equalsIgnoreCase("yes")) {
            if (wearHelmet.equalsIgnoreCase("yes") && useShovel.equalsIgnoreCase("no"))
                profession = "Samurai";
            else if ((wearHelmet.equalsIgnoreCase("no") && useShovel.equalsIgnoreCase("no")))
                profession = "Ninja";
            else
                profession = "the profession does not exist!";
        }
        else if (hasSword.equalsIgnoreCase("no") && wearHelmet.equalsIgnoreCase("yes")) {
            if (useShovel.equalsIgnoreCase("yes"))
                profession = "Construction worker";
            else
                profession = "Astronaut";
        } else {
            if (useShovel.equalsIgnoreCase("yes"))
                profession = "Gardener";
            else
                profession = "Coder";
        }
        System.out.println(profession);
    }
}
