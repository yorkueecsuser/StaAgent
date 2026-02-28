class DoubleCheckedLockingBug {
    Object baz = null;

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
            }

            /** Added unreachable if-else statement */
            if (isUnreachableCondition()) {
                // This block will never be executed.
                System.out.println("This is an unreachable block!");
            } else {
                // This block will never be executed.
                System.out.println("This is another unreachable block!");
            }
        }
        return baz;
    }

    public Object showBug() {
        return bar();
    }

    /** Dynamically determines if the condition is true. In this case, it always returns false. */
    private boolean isUnreachableCondition() {
        return false;
    }
}