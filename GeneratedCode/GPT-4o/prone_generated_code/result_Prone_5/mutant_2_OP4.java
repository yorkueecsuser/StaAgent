import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("Unreachable condition evaluated to false.");
        }
        return numbers.toString(); // BUG: ArrayToString
    }

    private boolean getUnreachableCondition() {
        // Here, we simulate a condition that will always return false in practice.
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}