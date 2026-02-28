class AvoidUsingOctalValuesBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10

        // Mutant: Unreachable while loop
        while (getFalseCondition()) {
            // This code is unreachable
            int x = 10;
            int y = 20;
            int z = x + y;
        }

        return i * j;  // Wrong output: 80, Correct output: 120
    }
}