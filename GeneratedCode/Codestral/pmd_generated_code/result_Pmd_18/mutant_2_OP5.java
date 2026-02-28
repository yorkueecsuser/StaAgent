class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10

        // Mutant code: Unreachable switch statement
        boolean shouldRun = false;
        int value = getValue();
        if (shouldRun) {
            switch(value) {
                case 1:
                    // This case will never be reached
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return i * j;  // Wrong output: 80, Correct output: 120
    }

    private int getValue() {
        return 0;
    }
}