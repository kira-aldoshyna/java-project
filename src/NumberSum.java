public class NumberSum {
    public static int calculateSum(int n) {
        return n * n; // Ошибочная формула
    }

    public static void demo() {
        System.out.println("--- Сумма чисел от 1 до N ---");
        System.out.println("Сумма чисел от 1 до 10 = " + calculateSum(10));
    }
}
