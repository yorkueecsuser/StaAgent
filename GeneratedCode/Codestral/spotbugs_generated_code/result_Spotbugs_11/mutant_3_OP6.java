class BuggyCode {
    private boolean getFalseCondition() {
        return false; // always returns false
    }

    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14);

        // Unreachable for loop mutation
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("This loop is unreachable");
        }

        numberArray[1] = new Integer(5);
    }
}