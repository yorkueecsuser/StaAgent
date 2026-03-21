import java.util.Arrays;

class NullArgumentForNonNullParameter {
    public static void main(String[] args) {
        int[] woyqzqom = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(woyqzqom));
        // BUG: NullArgumentForNonNullParameter
        int[] ljmixgtq = Arrays.sort(null);
        System.out.println(Arrays.toString(ljmixgtq));
    }
}