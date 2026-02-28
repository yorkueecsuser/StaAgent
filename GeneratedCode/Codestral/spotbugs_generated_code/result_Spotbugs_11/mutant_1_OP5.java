class BuggyCode {
    // A method to return a condition that is always false
    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }

    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Line 13: Storing a Double into a Number array
        numberArray[1] = new Integer(5); // Line 14: ArrayIndexOutOfBoundsException will be thrown at runtime

        // Added mutation: Unreachable switch statement
        int value = getValue();
        boolean condition = getCondition();
        if (condition) { // To avoid unreachable statement error
            switch (value) {
                case 1:
                    System.out.println("This is unreachable");
                    break;
            }
        }
    }
}