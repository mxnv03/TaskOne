import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double prob = Double.parseDouble(input.next());
        double prize = Double.parseDouble(input.next());
        double pay = Double.parseDouble(input.next());
        System.out.println("Был ли смысл???? -> " + profitableGamble(prob, prize, pay));
    }
    public static boolean profitableGamble(double prob, double prize, double pay) {
        return prob * prize > pay;
    }
}
