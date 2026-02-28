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

    // Mutant code for Duplication
    Object mutantBar() {
        if (baz == null) { // Duplicate the buggy code
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
              }
        }
        if (baz == null) { // Duplicated buggy code
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
}