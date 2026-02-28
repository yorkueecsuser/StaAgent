class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10

        // Mutant: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            int value = getValue();
            switch(value) {
                case 1:
                    System.out.println("Unreachable code executed");
                    break;
                default:
                    break;
            }
        }

        return i * j;  // Wrong output: 80, Correct output: 120
    }

    private boolean getCondition() {
        // Implement the logic to determine the condition dynamically at runtime
        // For the purpose of demonstration, I will return false
        return false;
    }

    private int getValue() {
        // Implement the logic to determine the value dynamically at runtime
        // For the purpose of demonstration, I will return 0
        return 0;
    }
}