public class NumberSum {
    public static int iterativeSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void demo() {
        System.out.println("Сумма от 1 до 10 = " + iterativeSum(10) + " (итеративно)");
    }
}
