import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        return numbers.toString(); // BUG: ArrayToString
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] wbnlsaua = {1, 2, 3, 4, 5};
        String hevehxda = example.showBug(wbnlsaua);
        System.out.println("Result: " + hevehxda);
    }
}