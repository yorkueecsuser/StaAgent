class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10

        // Mutant code: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block of code will never be executed because getCondition() always returns false
            System.out.println("This line should never be executed.");
        }

        return i * j;  // Wrong output: 80, Correct output: 120
    }

    // This method is added to ensure dynamic determination of the condition
    private boolean getCondition() {
        return false;
    }
}