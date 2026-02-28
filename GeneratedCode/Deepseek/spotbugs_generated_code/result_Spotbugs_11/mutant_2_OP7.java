class BuggyCode {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Storing a Double into a Number array

        // Inserting an unreachable while loop
        boolean condition = getFalseCondition();
        while (condition) {
            // This code will never be executed
            System.out.println("Unreachable code");
        }

        numberArray[1] = new Integer(5); // ArrayIndexOutOfBoundsException will be thrown at runtime
    }
}