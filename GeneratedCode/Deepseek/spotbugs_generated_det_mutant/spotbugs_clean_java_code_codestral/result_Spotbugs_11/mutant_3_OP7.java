// Java code demonstrating the bug described
// Mutation Operator: Unreachable while loop
// Bug: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)

class BuggyCode {
    private boolean getCondition() {
        return false; // The condition is always false
    }

    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Line 14: Storing a Double into a Number array

        // Mutant code: Unreachable while loop
        while (getCondition()) {
            // The condition is always false, so this loop is unreachable
            numberArray[1] = new Integer(5); // Line 19: This line would cause ArrayIndexOutOfBoundsException if the loop were reachable
        }
    }
}