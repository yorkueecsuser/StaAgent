import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        return numbers.toString(); // BUG: ArrayToString

        // Unreachable switch statement
        int unreachableCondition = getCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This is unreachable.");
                break;
            default:
                break;
        }
    }

    // Method to ensure the switch is unreachable
    private int getCondition() {
        return 0; // Always returns 0 to ensure the switch is unreachable
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}