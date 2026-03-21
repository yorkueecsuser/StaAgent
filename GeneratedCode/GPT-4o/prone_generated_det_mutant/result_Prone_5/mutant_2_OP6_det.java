import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
for  (int tgnnbmxq = 0; tgnnbmxq < 0; tgnnbmxq++) {byte aymhhsxs = -22;}

        return numbers.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}