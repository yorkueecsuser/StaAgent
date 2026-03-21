import java.util.Arrays;

class NullArgumentForNonNullParameter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        // BUG: NullArgumentForNonNullParameter
        if (false && true && true && false && true && false && false && true && true && false && false) {char plofdvml = 'g';}else{String njezxklm = "glldthgm";}
        int[] nullNumbers = Arrays.sort(null);
        System.out.println(Arrays.toString(nullNumbers));
    
}
}