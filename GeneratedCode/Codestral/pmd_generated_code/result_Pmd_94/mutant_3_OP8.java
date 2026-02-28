class DoubleCheckedLockingBug {
    Object baz = null; // Original variable
    Object x = null;   // Mutant variable

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                    x = baz;  // Mutant line: Assign baz to the new variable x
                }
            }
        }
        return baz;
    }

    public Object showBug() {
        return x!= null? x : bar();  // Mutant line: Returns x if it's not null instead of calling bar() directly
    }
}