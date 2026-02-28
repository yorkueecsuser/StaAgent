class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10

        // Mutant code: Unreachable for loop
        boolean condition = false;
        for (int k = 0; condition; k++) {
            System.out.println("This loop should never execute");
        }

        return i * j;  // Correct output: 120
    }

    private boolean getCondition() {
        return false;  // Dummy method for demonstration purpose, always returns false
    }
}