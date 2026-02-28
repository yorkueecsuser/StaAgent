import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This block is unreachable");
        }
        return numbers.toString(); // BUG: ArrayToString
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if condition unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}