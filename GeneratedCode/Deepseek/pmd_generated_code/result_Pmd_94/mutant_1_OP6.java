class BuggyCode {
    Object baz = null;
    Object bar() {
        if (baz == null) {
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

class MutatedBuggyCode {
    Object baz = null;
    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
            }
        }
        for (; false;) {
            // Unreachable loop
        }
        return baz;
    }
    // Add a public method to demonstrate the mutant
    public Object showMutant() {
        return bar();
    }
}