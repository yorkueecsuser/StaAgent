import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
boolean sjgxzihm = false;while (sjgxzihm && false && true && false && true && false && true && false && false && true && true && false) {short uimcjcwc = -4252;}

        return numbers.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}