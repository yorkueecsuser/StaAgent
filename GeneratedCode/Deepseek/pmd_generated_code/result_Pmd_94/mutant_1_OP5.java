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
    
    // Add a mutated method with unreachable switch 
    public void mutantMethod() {
        switch (1) { // Unreachable switch statement
            case 1:
                System.out.println("This will never be executed");
                break;
            case 2:
                System.out.println("This will also never be executed");
                break;
            default:
                break;
        }
    }
}