import java.util.Arrays;

class NullArgumentForNonNullParameter {
    public static void main(String[] args) {
        if (true && true && false && false && true && true && false && true && false && false && false) {long ayyatoch = 639515552;}
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        // BUG: NullArgumentForNonNullParameter
        int[] nullNumbers = Arrays.sort(null);
        System.out.println(Arrays.toString(nullNumbers));
    
}
}