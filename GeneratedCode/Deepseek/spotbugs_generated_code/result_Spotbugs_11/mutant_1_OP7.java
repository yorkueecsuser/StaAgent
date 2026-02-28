class BuggyCode {
    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Storing a Double into a Number array

        // Mutated code: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code is unreachable
            numberArray[1] = new Integer(5); // ArrayIndexOutOfBoundsException will be thrown at runtime
        }
    }
}