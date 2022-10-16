import java.util.Scanner;

public class Fiveth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(operation(N, a, b));
    }
    public static String operation(int N, int a, int b) {
        if (a - b == N) {
            return "subtracted";
        }
        else if (a + b == N) {
            return "added";
        }
        else if (a / b == N) {
            return "devided";
        }
        else if (a*b == N) {
            return "multiplied";
        }
        else {
            return "none";
        }
    }
}
