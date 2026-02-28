import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        return numbers.toString(); // BUG: ArrayToString
    }
    
    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Original assignment statement
        String result = example.showBug(numbers);
        // Duplicate assignment statement
        String resultDuplicate = example.showBug(numbers);
        
        System.out.println("Result: " + result);
    }
}