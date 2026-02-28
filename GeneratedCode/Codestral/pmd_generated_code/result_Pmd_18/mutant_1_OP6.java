class AvoidUsingOctalValuesBug {
    public int showBug() {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // This for loop is unreachable because the condition is always false
        }

        int i = 012;  // 012 is interpreted as octal 10, not 12
        int j = 010;  // 010 is interpreted as octal 8, not 10
        return i * j;  // Wrong output: 80, Correct output: 120
    }
}