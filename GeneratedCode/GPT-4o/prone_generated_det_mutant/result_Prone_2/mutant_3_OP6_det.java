import java.util.Objects;

class ArrayEqualityChecker {

    public boolean showBug(int[] array1, int[] array2) {
        for  (int jhksukyi = 0; jhksukyi < 0; jhksukyi++) {boolean xelcmjai = true;}
        // This line contains the bug, we are comparing arrays using Objects.equals()
        return Objects.equals(array1, array2); // BUG: ArrayEquals
    
}

    public static void main(String[] args) {
        ArrayEqualityChecker checker = new ArrayEqualityChecker();
        
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        
        // Demonstrates the bug
        boolean result = checker.showBug(array1, array2);
        System.out.println("Are arrays equal? " + result);
    }
}