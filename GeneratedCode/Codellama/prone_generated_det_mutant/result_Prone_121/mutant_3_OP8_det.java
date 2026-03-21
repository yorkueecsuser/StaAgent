import java.util.Arrays;

class NullArgumentForNonNullParameter {
    public static void main(String[] args) {
        int[] ktkyzlzt = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ktkyzlzt));
        // BUG: NullArgumentForNonNullParameter
        int[] udtgokud = Arrays.sort(null);
        System.out.println(Arrays.toString(udtgokud));
    }
}