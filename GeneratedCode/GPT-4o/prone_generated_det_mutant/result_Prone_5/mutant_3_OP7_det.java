import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
boolean fsdnxygq = false;while (fsdnxygq && false && false && false && false && false && true && true && true && true && true && false) {byte yueodduw = 0;}

        return numbers.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}