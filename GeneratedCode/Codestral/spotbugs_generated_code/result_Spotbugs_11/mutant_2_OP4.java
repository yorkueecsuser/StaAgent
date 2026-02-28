class BuggyCode {
    private boolean getCondition() {
        return false; // This method always returns false, making the inserted if-else statement unreachable
    }

    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Storing a Double into a Number array

        // Unreachable if-else statement as per the mutation operator
        if (getCondition()) {
            // This block is unreachable and will not be executed
            numberArray[1] = new Integer(5); // ArrayIndexOutOfBoundsException will be thrown at runtime
        } else {
            // This block is also unreachable and will not be executed
            System.out.println("This line will never be reached.");
        }
    }
}