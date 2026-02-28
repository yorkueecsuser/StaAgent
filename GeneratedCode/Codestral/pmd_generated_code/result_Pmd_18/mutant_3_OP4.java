class AvoidUsingOctalValuesBug {
    private boolean getFalseCondition() {
        return false; // always returns false
    }

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10

        // Mutant code added
        if (getFalseCondition()) {
            // Unreachable code for mutation operator: Unreachable if-else statement
            int k = 100;
            i = i * k;
        } else {
            // Alternative code
            j = j * 2;
        }

        return i * j;  // Wrong output: 80 with mutant code, Correct output: 120 without mutant code
    }
}