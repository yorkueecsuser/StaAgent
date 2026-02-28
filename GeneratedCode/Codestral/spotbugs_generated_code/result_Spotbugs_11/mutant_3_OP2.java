class BuggyCode {
    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Line 8: Storing a Double into a Number array
        numberArray[0] = new Double(3.14); // Line 10: Duplicated assignment statement
        numberArray[1] = new Integer(5); // Line 11: ArrayIndexOutOfBoundsException will be thrown at runtime
    }
}