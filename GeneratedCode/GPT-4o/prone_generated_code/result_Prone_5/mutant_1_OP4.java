import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        // Introduce an unreachable if-else statement
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This will never print");
        } else {
            System.out.println("This is the else part of the unreachable if-else");
        }
        
        return numbers.toString(); // BUG: ArrayToString
    }

    // Method to ensure the condition is never true
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}