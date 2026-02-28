class BuggyCode {
    public void showBug() {
        Number[] numberArray = new Number[1];
        int index = 0;
        do {
            numberArray[index] = new Double(3.14); // Line 9: Storing a Double into a Number array
            index++;
        } while (index < 2); // Line 12: This will cause ArrayIndexOutOfBoundsException at runtime
    }
}