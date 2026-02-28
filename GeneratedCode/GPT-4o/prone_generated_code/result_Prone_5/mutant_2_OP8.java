import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        return numbers.toString(); // BUG: ArrayToString
    }

    // Mutant code
    public String showBug(int[] x) {
        return x.toString(); // BUG: ArrayToString
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);

        // Mutant code execution
        int[] y = {1, 2, 3, 4, 5};
        String mutantResult = example.showBug(y);
        System.out.println("Mutant Result: " + mutantResult);
    }
}