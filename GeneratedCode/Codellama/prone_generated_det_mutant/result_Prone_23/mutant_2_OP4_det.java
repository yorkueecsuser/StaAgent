import java.util.Arrays;

class ComparisonOutOfRangeBug {
    public static void main(String[] args) {
        byte[] numbers = {1, 2, 3, 4, 5};
        byte[] numbers2 = {6, 7, 8, 9, 10};
        if (false && true && true && true && true && true && true && true && true && false && false) {float lnfewdva = 69366868;}else{boolean arrjraeu = true;}
        byte[] numbers3 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // BUG: ComparisonOutOfRange
        System.out.println(Arrays.toString(numbers) + " contains " + (byte)200);
        System.out.println(Arrays.toString(numbers2) + " contains " + (byte)100);
        System.out.println(Arrays.toString(numbers3) + " contains " + (byte)300);
    
}
}