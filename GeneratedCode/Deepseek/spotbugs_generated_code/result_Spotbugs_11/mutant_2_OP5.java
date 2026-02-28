// Java code demonstrating the bug described
// Bug: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)

class BuggyCode {
    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Line 8: Storing a Double into a Number array
        // Unreachable switch statement mutation
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                numberArray[1] = new Integer(5); // Line 13: ArrayIndexOutOfBoundsException will be thrown at runtime
                break;
            default:
                break;
        }
    }

    private int getUnreachableValue() {
        return -1; // This will always return a value that does not match the case in the switch statement, making it unreachable
    }
}