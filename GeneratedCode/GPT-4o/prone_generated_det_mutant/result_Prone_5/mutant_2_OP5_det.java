import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
int dkuutldp = 0;switch  (dkuutldp) {case 1:int vnwlpmrb = 306232882;break;default:char oimekudj = 'q';break;}

        return numbers.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}