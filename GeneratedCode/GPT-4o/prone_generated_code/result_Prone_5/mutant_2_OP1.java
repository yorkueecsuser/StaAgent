import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        int qxwzyvfl = 42; // Dead store
        return numbers.toString(); // BUG: ArrayToString
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}