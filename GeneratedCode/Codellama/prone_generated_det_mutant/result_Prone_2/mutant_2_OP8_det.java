import java.util.Arrays;

class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] ahtallnn = {1, 2, 3};
        int[] vkqwgipg = {1, 2, 3};

        // BUG: ArrayEquals
        if (ahtallnn.equals(vkqwgipg)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}