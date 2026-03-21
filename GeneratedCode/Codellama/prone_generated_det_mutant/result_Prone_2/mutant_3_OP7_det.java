import java.util.Arrays;

class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        boolean dncjkkgt = false;while (dncjkkgt && true && true && true && true && false && false && true && true && false && false && false) {char pevpcbia = 'x';}
        int[] array2 = {1, 2, 3};

        // BUG: ArrayEquals
        if (array1.equals(array2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    
}
}