class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10

        // Mutated code: Unreachable for loop
        boolean conditionFor = getCondition(); // Replace getCondition() with a method that returns false
        for (int k = 0; conditionFor; k++) {
            // This code will never execute
        }

        return i * j;  // Wrong output: 80, Correct output: 120
    }

    private boolean getCondition() {
        // Replace this method with one that returns false
        return false;
    }
}