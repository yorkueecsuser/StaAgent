import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        // Unreachable while loop added
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This will never be printed.");
        }
        
        return numbers.toString(); // BUG: ArrayToString
    }

    private boolean getCondition() {
        // This method returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}