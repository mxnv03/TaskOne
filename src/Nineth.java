import java.sql.Array;
import java.util.Scanner;

public class Nineth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = input.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(sumOfCubes(arr));
    }
    public static int sumOfCubes(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i]*a[i]*a[i];
        }
        return sum;
    }
}
