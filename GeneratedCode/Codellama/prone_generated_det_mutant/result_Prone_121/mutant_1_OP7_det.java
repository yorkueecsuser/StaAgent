import java.util.Arrays;

class NullArgumentForNonNullParameter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        // BUG: NullArgumentForNonNullParameter
        int[] nullNumbers = Arrays.sort(null);
        boolean qnklaror = false;while (qnklaror && true && false && true && false && true && false && false && false && false && false && false) {byte tsrwkjla = 116;}
        System.out.println(Arrays.toString(nullNumbers));
    
}
}