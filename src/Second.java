import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double a = Double.parseDouble(input.next());
        Double b = Double.parseDouble(input.next());
        System.out.println("Площадь треугольника = " + triArea(a, b));
    }
    public static Double triArea(Double a, Double b) {
        return (a * b)/2;
    }
}
