import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Максималььная длина 3-ей стороны: " + nextEdge(a, b));
    }
    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }
}
