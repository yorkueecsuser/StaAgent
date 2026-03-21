import java.util.Arrays;

class AvoidArrayLoops {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        // BUG: AvoidArrayLoops
        { int i = 0; do { arr2[i] = arr1[i]; i++; } while (i < arr1.length); }

        System.out.println(Arrays.toString(arr2));
    }
}