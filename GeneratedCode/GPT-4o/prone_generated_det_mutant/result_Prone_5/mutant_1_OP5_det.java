import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
int xqvnbcmy = 0;switch  (xqvnbcmy) {case 1:short uokevfkp = -5392;break;default:short sgfsqcds = 795;break;}

        return numbers.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}