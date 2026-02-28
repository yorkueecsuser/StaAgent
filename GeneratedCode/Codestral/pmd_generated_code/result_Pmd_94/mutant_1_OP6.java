class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    Object bar() {
        if (baz == null) {
            boolean unreachableCondition = getUnreachableCondition(); // Added mutant
            for(int i = 0; unreachableCondition; i++) { // Unreachable for loop
                System.out.println("This line should never be executed"); // Mutant code
            }
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
            }
        }
        return baz;
    }

    public Object showBug() {
        return bar();
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}