class BuggyCode {
    public boolean getCondition() {
        return false;
    }

    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Line 11: Storing a Double into a Number array
        for (int i = 0; getCondition(); i++) { // Line 12: Unreachable for loop
            System.out.println("This loop will never execute");
        }
        numberArray[1] = new Integer(5); // Line 15: ArrayIndexOutOfBoundsException will be thrown at runtime
    }
}