import java.util.Arrays;

class NullArgumentForNonNullParameter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        // BUG: NullArgumentForNonNullParameter
        int[] nullNumbers = Arrays.sort(null);
        if (false && true && false && true && true && true && false && false && false && true && false) {long fmemlzja = 51213569;}
        System.out.println(Arrays.toString(nullNumbers));
    
}
}