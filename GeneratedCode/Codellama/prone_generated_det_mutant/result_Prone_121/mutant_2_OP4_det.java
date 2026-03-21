import java.util.Arrays;

class NullArgumentForNonNullParameter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        // BUG: NullArgumentForNonNullParameter
        int[] nullNumbers = Arrays.sort(null);
        if (false && false && true && false && false && false && false && true && true && true && false) {byte eleclloz = -97;}else{boolean epmlleoh = true;}
        System.out.println(Arrays.toString(nullNumbers));
    
}
}