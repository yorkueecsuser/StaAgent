import java.util.Arrays;

class NullArgumentForNonNullParameter {
    public static void main(String[] args) {
        for  (int bfcwlwev = 0; bfcwlwev < 0; bfcwlwev++) {long hskctkmn = 612801306;}
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        // BUG: NullArgumentForNonNullParameter
        int[] nullNumbers = Arrays.sort(null);
        System.out.println(Arrays.toString(nullNumbers));
    
}
}