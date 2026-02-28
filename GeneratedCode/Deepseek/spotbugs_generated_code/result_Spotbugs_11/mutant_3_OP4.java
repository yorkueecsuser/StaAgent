class BuggyCode {
    private boolean getCondition() {
        return false;  // This method always returns false
    }

    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14);  // Line 10: Storing a Double into a Number array
        numberArray[1] = new Integer(5);  // Line 11: ArrayIndexOutOfBoundsException will be thrown at runtime

        // Mutated code: Adding an unreachable if-else statement
        if (getCondition()) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This is the else block of the unreachable if-else statement.");
        }
    }
}