package nyc.c4q.yuliyakaleda;

/**
 * Created by olgakoleda on 3/8/15.
 */
public class count {
    public static void main(String[] args) {
        int initial = 100;

        while (initial > 10) {
            System.out.println(initial);
            initial -= 5;
        }
        while (initial > 0) {
            System.out.println(initial);
            initial-=1;
        }
        System.out.println("Blastoff!");
    }
}
