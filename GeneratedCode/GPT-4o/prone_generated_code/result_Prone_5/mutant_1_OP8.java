import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        return numbers.toString(); // BUG: ArrayToString
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}

// Mutant code with renaming applied to the variable 'numbers' in method showBug
class ArrayToStringExampleMutant {

    public String showBug(int[] x) {
        return x.toString(); // BUG: ArrayToString
    }

    public static void main(String[] args) {
        ArrayToStringExampleMutant exampleMutant = new ArrayToStringExampleMutant();
        int[] numbers = {1, 2, 3, 4, 5};
        String resultMutant = exampleMutant.showBug(numbers);
        System.out.println("Result (Mutant): " + resultMutant);
    }
}