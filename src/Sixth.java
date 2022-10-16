import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char a = input.next().charAt(0);
        System.out.println("ASCII код '" + a + "' = " + ctoa(a));
    }
    public static int ctoa(char a) {
        int ascii = a;              // auto cast char to int
        return ascii;
    }
    }


