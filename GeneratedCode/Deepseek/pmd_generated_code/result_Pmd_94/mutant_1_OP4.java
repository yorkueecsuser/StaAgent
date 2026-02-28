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
    // Add mutant: unreachable if-else statement
    Object barMutant() {
        if (baz == null) { 
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
            }
        }
        else { // Unreachable if-else statement condition is always false
            doSomethingUnreachable();
        }
        return baz;
    }
    // Add a public method to demonstrate the mutant
    public Object showMutantBug() {
        return barMutant();
    }
    // Add a method that is unreachable due to the above if-else condition
    private void doSomethingUnreachable() {
        // Unreachable code
        int x = getX();
    }
    // Add a method to get X
    private int getX() {
        return 10;
    }
}