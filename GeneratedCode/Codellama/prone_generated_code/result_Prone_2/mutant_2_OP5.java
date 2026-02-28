import java.util.Arrays;

class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // BUG: ArrayEquals
        if (array1.equals(array2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
        
        // Unreachable switch statement mutant
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This code is also unreachable");
                break;
        }
    }
}