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

    // Added mutation: unreachable while loop
    void unreachableWhileLoop() {
        while (false) {
            // This loop will never be executed since the condition is always false
            System.out.println("This will never be printed");
        }
    }
}