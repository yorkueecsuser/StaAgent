import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        return numbers.toString(); // BUG: ArrayToString

        // Unreachable switch statement inserted
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("Nor will this.");
                break;
            default:
                System.out.println("Default case, also unreachable.");
        }
    }

    private int getUnreachableValue() {
        return -1; // Ensures no case is matched
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}