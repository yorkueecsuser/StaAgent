class BuggyCode {
    Object baz = null; // volatile Object baz = null;
    Object bar() {
        if (baz == null) { // BUG: DoubleCheckedLocking
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
              }
        }
        return baz;
    }
    // Add a public method to demonstrate the bug
    public Object showBug() {
        return bar();
    }

    // Added Mutant: Unreachable switch statement
    private void unreachableSwitchStatement() {
        int unreachableValue = 0;
        switch (unreachableValue) {
            default:
                break;
        }
    }
}