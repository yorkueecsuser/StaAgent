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

    // Mutated method
    Object duplicatedMutant() {
        if (baz == null) { 
            synchronized(this) {
                if (baz == null) {
                    // Mutation: Duplicated assignment statement
                    baz = new Object();

                    // Unique mutation: Duplicating assignment statement
                    baz = new Object();
                }
            }
        }
        return baz;
    }
}