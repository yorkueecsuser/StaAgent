class BuggyCode {
    Object baz = null; // volatile Object baz = null;
    
    // New mutated variable named 'qux'
    Object qux = null;
    
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

    // New mutated method named'showQux'
    public Object showQux() {
        return qux;
    }

    // Add a public method to demonstrate the bug
    public Object showBug() {
        return bar();
    }
}