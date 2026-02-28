class BuggyCode {
    // Method to simulate a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Line 13: Storing a Double into a Number array

        // Mutation Operator: Unreachable if-else statement
        if (getCondition()) {
            // This block is unreachable, but it's added to maintain the original bug
            numberArray[1] = new Integer(5); // Line 17: ArrayIndexOutOfBoundsException will be thrown at runtime
        } else {
            // This block is also unreachable
            System.out.println("This line is unreachable");
        }
    }
}