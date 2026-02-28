import java.lang.System;

class FinalizeBug {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        myObject.showBug();
    }
}

class MyObject {
    public void showBug() {
        System.out.println("Buggy code execution");
    }

    protected void finalize() {
        releaseSomeResources(); // BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
    }

    private void releaseSomeResources() {
        System.out.println("Release some resources");
    }
    
    // Unreachable if-else statement
    public void exampleMethod() {
        boolean condition = getCondition();
        if (condition) {
            // Code that is always executed
            System.out.println("This branch is always executed");
        } else {
            // Code that is always skipped
            System.out.println("This branch is always skipped");
        }
    }
    
    // Helper method to determine condition
    private boolean getCondition() {
        boolean condition = false;
        // Perform some logic to determine condition
        return condition;
    }
}