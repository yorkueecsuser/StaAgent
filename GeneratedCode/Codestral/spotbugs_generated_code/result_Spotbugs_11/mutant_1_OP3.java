class BuggyCode {
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Line 11: Storing a Double into a Number array

        if (getCondition()) { // unreachable if statement
            numberArray[1] = new Integer(5); // Line 14: ArrayIndexOutOfBoundsException will still be thrown at runtime
        }
    }
}