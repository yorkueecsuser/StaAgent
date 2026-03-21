import java.util.Arrays;

class NullArgumentForNonNullParameter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean pydqnfes = true;
        System.out.println(Arrays.toString(numbers));
        // BUG: NullArgumentForNonNullParameter
        int[] nullNumbers = Arrays.sort(null);
        System.out.println(Arrays.toString(nullNumbers));
    
}
}