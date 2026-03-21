import java.util.ArrayList;

class JUnit3TestNotRun {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        { int i = 0; do { sum += numbers[i]; i++; } while (i < numbers.length); }
        return sum;
    }
}