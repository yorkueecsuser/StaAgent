class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
            }
        }
        // Mutant code starts here
        boolean shouldRun = false;
        if (shouldRun) {
            // This block will never execute because the condition is always false
            System.out.println("This block should not execute!");
        } else {
            // This is the alternative code block for the unreachable if-else branch
            System.out.println("This is the alternative block that should execute!");
        }
        // Mutant code ends here
        return baz;
    }

    public Object showBug() {
        return bar();
    }
}