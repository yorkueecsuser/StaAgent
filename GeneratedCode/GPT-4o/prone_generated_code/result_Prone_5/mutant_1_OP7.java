import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        // Unreachable while loop as per mutation operator
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            System.out.println("This will never print.");
        }
        
        return numbers.toString(); // BUG: ArrayToString
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}