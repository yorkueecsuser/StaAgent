import java.util.Arrays;

class NullArgumentForNonNullParameter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        // BUG: NullArgumentForNonNullParameter
        int[] nullNumbers = Arrays.sort(null);
        for  (int tlhhjamp = 0; tlhhjamp < 0; tlhhjamp++) {int idwdifde = -514163966;}
        System.out.println(Arrays.toString(nullNumbers));
    
}
}