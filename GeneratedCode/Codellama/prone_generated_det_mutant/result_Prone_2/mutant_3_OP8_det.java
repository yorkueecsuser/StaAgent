import java.util.Arrays;

class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] whrpicrg = {1, 2, 3};
        int[] bkfzxfnt = {1, 2, 3};

        // BUG: ArrayEquals
        if (whrpicrg.equals(bkfzxfnt)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}