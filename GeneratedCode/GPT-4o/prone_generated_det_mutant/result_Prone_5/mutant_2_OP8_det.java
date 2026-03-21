import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        return numbers.toString(); // BUG: ArrayToString
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] vigdxccg = {1, 2, 3, 4, 5};
        String pmpixqbo = example.showBug(vigdxccg);
        System.out.println("Result: " + pmpixqbo);
    }
}