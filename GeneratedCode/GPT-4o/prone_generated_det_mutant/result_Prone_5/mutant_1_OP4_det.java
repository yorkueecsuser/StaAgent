import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
if (true && false && true && false && false && true && false && true && true && false && false) {boolean bgsljbxc = false;}else{long fbvzcoml = 872770554;}

        return numbers.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}