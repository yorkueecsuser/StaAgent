// Java code demonstrating the bug described
// Bug: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)

class BuggyCode {
    private boolean getCondition() {
        return false; // Always returns false to make the if statement unreachable
    }

    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Line 8: Storing a Double into a Number array
        // Added mutant code to insert unreachable if statement
        if (getCondition()) {
            numberArray[1] = new Integer(5); // Line 9: ArrayIndexOutOfBoundsException will be thrown at runtime
        }
    }
}