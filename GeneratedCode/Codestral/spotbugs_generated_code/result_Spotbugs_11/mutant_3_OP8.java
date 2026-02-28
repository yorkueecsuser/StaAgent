// Java code demonstrating the bug described
// Bug: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)

class BuggyCode {
    public void showBug() {
        Number[] numArr = new Number[1]; // Renamed numberArray to numArr
        numArr[0] = new Double(3.14); // Line 7: Storing a Double into a Number array
        numArr[1] = new Integer(5); // Line 8: ArrayIndexOutOfBoundsException will be thrown at runtime
    }
}