class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10

        // Mutation: Inserted unreachable while loop
        boolean shouldRun = getCondition();
        while (!shouldRun) {
            System.out.println("This line will never be executed.");
        }

        return i * j;  // Wrong output: 80, Correct output: 120
    }

    // Helper method to generate condition
    public boolean getCondition() {
        return false;
    }
}