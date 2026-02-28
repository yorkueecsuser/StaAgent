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
    
    int getCondition() {
        return 0;
    }
    
    // Add a public method to demonstrate the bug
    public Object showBug() {
        // Unreachable switch statement
        switch(getCondition()) {
            case 0:
                return bar();
            default:
                break;
        }
        return baz;
    }
}