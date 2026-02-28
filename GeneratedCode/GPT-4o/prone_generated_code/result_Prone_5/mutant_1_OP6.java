import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        // Mutation: unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line is unreachable");
        }

        return numbers.toString(); // BUG: ArrayToString
    }

    // Helper method to ensure the for loop is unreachable
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