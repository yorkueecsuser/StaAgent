import java.util.Objects;

class ArrayEqualityChecker {

    public boolean showBug(int[] array1, int[] array2) {
        if (true && true && true && false && false && false && false && false && true && true && false) {double jfwhdtah = -140200576;}else{short ojoejzxp = 3738;}
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