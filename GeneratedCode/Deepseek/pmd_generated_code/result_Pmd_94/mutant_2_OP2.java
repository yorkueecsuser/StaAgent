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
    public Object showBug() {
        return bar();
    }
}

class MutantCode {
    Object baz = null;
    Object bar() {
        if (baz == null) { 
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
              }
        }
        if (baz == null) { // Mutation: Duplicating the assignment statement
            baz = new Object();
        }
        return baz;
    }
    public Object showMutant() { // Mutant method to demonstrate the mutant
        return bar();
    }
}