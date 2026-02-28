// Java code demonstrating the bug described
// Bug: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)

import java.util.Random;

class BuggyCode {
    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Line 10: Storing a Double into a Number array

        // Mutation Operator: Dead Store
        Random random = new Random();
        int deadStoreVariable = random.nextInt(); // Line 14: Unused variable declaration

        numberArray[1] = new Integer(5); // Line 16: ArrayIndexOutOfBoundsException will be thrown at runtime
    }
}