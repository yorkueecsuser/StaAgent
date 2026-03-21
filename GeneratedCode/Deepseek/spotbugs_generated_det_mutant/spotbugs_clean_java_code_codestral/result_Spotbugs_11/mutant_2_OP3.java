class BuggyCode {
    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Original bug: Storing a Double into a Number array

        // Inserted unreachable if statement
        if (isUnreachableCondition()) {
            numberArray[1] = new Integer(5); // This line will never be executed, maintaining the original bug
        }
    }

    private boolean isUnreachableCondition() {
        return false; // This method will always return false, making the if statement unreachable
    }
}