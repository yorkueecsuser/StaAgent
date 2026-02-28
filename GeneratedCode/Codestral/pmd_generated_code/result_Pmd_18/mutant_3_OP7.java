class AvoidUsingOctalValuesBug {
    public int showBug() {
        // Introduce an unreachable while loop
        while (getFalseCondition()) {
            // This code is unreachable
            System.out.println("Unreachable code");
        }

        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10
        return i * j;  // Wrong output: 80, Correct output: 120
    }

    private boolean getFalseCondition() {
        return false;
    }
}