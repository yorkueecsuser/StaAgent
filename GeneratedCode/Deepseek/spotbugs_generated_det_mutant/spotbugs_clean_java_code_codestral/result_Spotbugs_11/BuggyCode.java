// Java code demonstrating the bug described
// Bug: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)

class BuggyCode {
    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Line 8: Storing a Double into a Number array
        numberArray[1] = new Double(5.0); // Line 9: Replaced Integer with Double to maintain the bug
    }
}