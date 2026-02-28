class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    private boolean getFalseCondition() {
        return false;
    }

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    // Inserted unreachable switch statement
                    switch (getFalseCondition()) {
                        case true:
                            // This case will never be reached
                            System.out.println("Unreachable code");
                            break;
                    }

                    baz = new Object();
                }
            }
        }
        return baz;
    }

    public Object showBug() {
        return bar();
    }
}