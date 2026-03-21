import java.util.Arrays;

class ArrayEqualityBug {

    public boolean showBug(int[] array1, int[] array2) {
int uhdtzylp = 0;switch  (uhdtzylp) {case 1:long sxykevlw = -753546394;break;default:double exltxgic = 563573212;break;}

        return array1.equals(array2); // BUG: ArrayEquals
    
}

    public static void main(String[] args) {
        ArrayEqualityBug bugDemo = new ArrayEqualityBug();
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {1, 2, 3};
        boolean result = bugDemo.showBug(arrayA, arrayB);
        System.out.println("Result of buggy comparison: " + result);
    }
}