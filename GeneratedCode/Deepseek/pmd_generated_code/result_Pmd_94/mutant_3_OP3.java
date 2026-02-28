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
        // Unreachable if statement mutation
        if (getCondition()) { 
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        // System.out.println("This code is unreachable");
        return baz;
    }
    // Add a public method to demonstrate the bug
    public Object showBug() {
        return bar();
    }

    private boolean getCondition() {
        // Randomly return either true or false
        return Math.random() < 0.5;
    }
}