class InfiniteLoopBug {
    public int showBug() {
        int j = 0;
        while (true) { // Noncompliant; end condition omitted - Bug: Loops should not be infinite
            j++;
            if (j == Integer.MAX_VALUE) {
                break;
            }
            // Mutant code: unreachable switch statement
            boolean shouldSwitch = getCondition();
            if (shouldSwitch) {
                int value = getValue();
                switch (value) {
                    case 1:
                        // This case is unreachable because value is never 1
                        System.out.println("Unreachable code");
                        break;
                }
            }
        }
        return j;
    }

    private boolean getCondition() {
        // This method always returns false to make the switch statement unreachable
        return false;
    }

    private int getValue() {
        // This method returns a value that is never 1 to make the switch statement unreachable
        return 2;
    }
}