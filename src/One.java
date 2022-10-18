
public class One {
    public static void main(String[] args) {
        System.out.println("1 задание: " + remainder(3,2)); // 1
        System.out.println("2 задание: " + triArea(5.0, 2.1)); // 2
        System.out.println("3 задание: " + animals(2, 3, 1)); // 3
        System.out.println("4 задание: " + profitableGamble(2, 5.0, 7.0)); // 4
        System.out.println("5 задание: " + operation(25, 9, 16)); // 5
        System.out.println("6 задание: " + ctoa('a')); // 6
        System.out.println("7 задание: " + addUpTo(5)); // 7
        System.out.println("8 задание: " + nextEdge(8, 7)); // 8
        System.out.println("9 задание: " + sumOfCubes(new int[] {1, 2, 3, 4})); // 9
        System.out.println("10 задание: " + abcmath(2, 3, 6)); // 10
        }
        public static int remainder(int a, int b) {
        return a % b; // возвращает остаток от деления
    }
    public static Double triArea(Double a, Double b) {
        return (a * b)/2; // вычисление площади трекгольника по стандартной формуле
    }
    public static int animals(int a, int b, int c) {
        final int chickens = 2;
        final int cows = 4;
        final int pigs = 4; // объявление констант
        return chickens*a + cows*b + pigs*c; // результат
    }
    public static boolean profitableGamble(double prob, double prize, double pay) {
        return prob * prize > pay; // стоило ли играть?
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
    public static int ctoa(char a) {
        // возвращение askii кода буквы
        return a;
    }
    public static int addUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }
    public static int sumOfCubes(int[] a) {
        int sum = 0; // инициализация нулевой суммы
        for (int j : a) {
            sum += j * j * j; // прибавление к сумме элемена в 3ей степени
        }
        return sum;
    }
    public static boolean abcmath(int a, int b, int c) {
        for (int i = 0; i < b; i++) {
            a += a; // прибавление несколько раз
        }
        return a % c == 0; // проверка на деление
    }

}
