import java.util.Arrays;

class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] szsrhixa = {1, 2, 3};
        int[] qgyjyfcz = {1, 2, 3};

        // BUG: ArrayEquals
        if (szsrhixa.equals(qgyjyfcz)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}