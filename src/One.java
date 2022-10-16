import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(remainder(a, b));
        }
        public static int remainder(int a, int b) {
            return a % b;
    }
}
