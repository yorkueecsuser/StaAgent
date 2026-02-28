// Java code demonstrating the bug described and an unreachable for loop

class BuggyCode {
    public void showBug() {
        Number[] numberArray = new Number[1];
        numberArray[0] = new Double(3.14); // Storing a Double into a Number array

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable loop executed");
        }

        numberArray[1] = new Integer(5); // ArrayIndexOutOfBoundsException will be thrown at runtime
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}