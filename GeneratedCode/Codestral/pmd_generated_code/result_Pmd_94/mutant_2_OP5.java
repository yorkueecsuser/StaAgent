class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                    // Insert unreachable switch statement
                    boolean condition = falseCondition();
                    switch (condition) {
                        case true:
                            // This code is unreachable
                            System.out.println("Unreachable code");
                            break;
                    }
                }
            }
        }
        return baz;
    }

    public Object showBug() {
        return bar();
    }

    private boolean falseCondition() {
        return false;
    }
}