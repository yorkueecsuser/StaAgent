import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
if (false && true && true && true && false && false && true && false && true && true && false) {double mlawzffr = -508026232;}else{byte drbseczx = 35;}

        return numbers.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}