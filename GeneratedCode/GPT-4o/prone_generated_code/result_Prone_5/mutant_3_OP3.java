import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        boolean unreachableCondition = getUnreachableCondition(); // Non-final variable for unreachable condition
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }
        return numbers.toString(); // BUG: ArrayToString
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false, making the if block unreachable
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}