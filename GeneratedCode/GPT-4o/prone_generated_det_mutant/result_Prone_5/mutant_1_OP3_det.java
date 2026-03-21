import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
if (false && false && false && false && true && false && false && true && false && true && false) {byte tgejnfkw = 48;}

        return numbers.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}