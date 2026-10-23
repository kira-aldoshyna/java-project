public class EvenOdd {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void demo() {
        System.out.println("--- Чётность числа ---");
        int[] testNumbers = {4, 7, 0};
        for (int num : testNumbers) {
            System.out.println("Число " + num + " -> " + (isEven(num) ? "чётное" : "нечётное"));
        }
    }
}
