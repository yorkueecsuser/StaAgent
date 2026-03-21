import java.util.Arrays;

class ArrayEqualsBug {
    public static void main(String[] args) {
        float diadnxyu = -103280608;
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // BUG: ArrayEquals
        if (array1.equals(array2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    
}
}