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
}

class Mutant {
    Object bazZ = null;
    Object bar() {
        if (bazZ == null) { // Mutated by Renaming
            synchronized(this) {
                if (bazZ == null) {
                    bazZ = new Object();
                }
              }
        }
        return bazZ;
    }
    // Add a public method to demonstrate the bug
    public Object showMutant() {
        return bar();
    }
}