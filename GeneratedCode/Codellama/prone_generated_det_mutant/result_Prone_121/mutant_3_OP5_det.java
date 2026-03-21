import java.util.Arrays;

class NullArgumentForNonNullParameter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        // BUG: NullArgumentForNonNullParameter
        int[] nullNumbers = Arrays.sort(null);
        int jtgrxbho = 0;switch  (jtgrxbho) {case 1:short fpcobnee = -1958;break;default:char cyfqpjxm = 'd';break;}
        System.out.println(Arrays.toString(nullNumbers));
    
}
}