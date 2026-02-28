class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10

        // Mutant: Unreachable if statement
        if (isUnreachableCondition()) {
            System.out.println("This code should never execute.");
        }

        return i * j;  // Wrong output: 80, Correct output: 120
    }

    private boolean isUnreachableCondition() {
        // This method returns a constant value, but it's a good practice
        // to use a method call to generate a condition that is always false.
        return false;
    }
}