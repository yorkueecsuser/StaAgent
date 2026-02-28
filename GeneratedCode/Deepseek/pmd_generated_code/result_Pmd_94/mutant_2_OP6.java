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

    // New mutant code
    void unreachableForLoopMutant() {
        boolean condition = false;
        if (condition) {
            for (int i = 0; i < 10; i++) {
                // Unreachable code
                System.out.println("This code is unreachable");
            }
        }
    }
}