class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        // Original bug: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        boolean result = Thread.interrupted();

        // Mutant: Unreachable switch statement
        boolean unusedCondition = getUnusedCondition();
        if (unusedCondition) {
            int unreachableValue = 1;
            switch (unreachableValue) {
                case 2:
                    System.out.println("This code should never be executed.");
                    break;
            }
        }

        return result;
    }

    // This method will always return false to make the switch statement unreachable.
    private boolean getUnusedCondition() {
        return false;
    }

    // This method will always return a value that is not present in the switch statement.
    private int getUnreachableValue() {
        return 1;
    }
}