import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("Всего ног: " + animals(a, b, c));
    }
    public static int animals(int a, int b, int c) {
        final int chickens = 2;
        final int cows = 4;
        final int pigs = 4;
        return chickens*a + cows*b + pigs*c;
    }
}
