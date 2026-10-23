public class NumberSum {
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void demo() {
        System.out.println("Сумма от 1 до 10 = " + formulaSum(10) + " (формула)");
    }
}
