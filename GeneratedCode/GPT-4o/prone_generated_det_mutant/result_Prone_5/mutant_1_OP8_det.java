import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        return numbers.toString(); // BUG: ArrayToString
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] uqjszozu = {1, 2, 3, 4, 5};
        String xybqvwaa = example.showBug(uqjszozu);
        System.out.println("Result: " + xybqvwaa);
    }
}