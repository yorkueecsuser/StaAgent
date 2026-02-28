import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        return numbers.toString(); // BUG: ArrayToString
    }

    public String showBug(int[] a) { // Mutant method with renamed parameter
        return a.toString(); // BUG: ArrayToString
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);

        // Using mutant method
        String mutantResult = example.showBug(numbers);
        System.out.println("Mutant Result: " + mutantResult);
    }
}