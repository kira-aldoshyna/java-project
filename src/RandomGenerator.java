import java.util.Random;

public class RandomGenerator {
    public static void demo() {
        System.out.println("--- Генератор случайных чисел ---");
        Random random = new Random(42); // фиксированный зерно для постоянства
        System.out.print("5 случайных чисел от 1 до 100: ");
        for (int i = 0; i < 5; i++) {
            System.out.print((random.nextInt(100) + 1) + " ");
        }
        System.out.println();
    }
}
