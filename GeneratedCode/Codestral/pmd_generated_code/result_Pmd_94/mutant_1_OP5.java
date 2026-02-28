class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    int unreachable = getUnreachableValue(); // Added line
                    switch (unreachable) { // Added line
                        case 1: // Unreachable case
                            System.out.println("Unreachable code"); // Added line
                            break; // Added line
                    } // Added line
                    baz = new Object();
                }
            }
        }
        return baz;
    }

    private int getUnreachableValue() { // Added method
        return -1;
    }

    public Object showBug() {
        return bar();
    }
}