class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        boolean interrupted = Thread.interrupted();

        // Mutant code: Unreachable switch statement
        boolean condition = false;
        switch (condition) {
            case true:
                // Unreachable code
                System.out.println("This is unreachable code");
                break;
        }

        return interrupted;
    }

    private boolean getCondition() {
        return false;
    }
}