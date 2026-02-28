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

    // Generate a private method with a compile-time constant return type of false
    // This is mutation generated code
    private boolean getCondition() {
        return false;
    }

    // Mutation generated code
    Object barMutant() {
        if (baz == null) { // DoubleCheckedLocking
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
            }
        }
        // Added unreachable if statement (compile-time constant condition false)
        if (getCondition()) {
            // Unreachable code (will never be executed)
            baz = new Object();
        }
        return baz;
    }

    // Add a public method to demonstrate the mutant
    public Object showMutant() {
        return barMutant();
    }
}