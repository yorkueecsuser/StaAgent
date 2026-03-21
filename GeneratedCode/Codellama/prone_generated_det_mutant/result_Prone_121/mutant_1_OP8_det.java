import java.util.Arrays;

class NullArgumentForNonNullParameter {
    public static void main(String[] args) {
        int[] ovxsppuq = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ovxsppuq));
        // BUG: NullArgumentForNonNullParameter
        int[] icqkhqea = Arrays.sort(null);
        System.out.println(Arrays.toString(icqkhqea));
    }
}