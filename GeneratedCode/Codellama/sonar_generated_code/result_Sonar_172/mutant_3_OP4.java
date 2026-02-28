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
}

// Mutated code
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
    public void unreachable() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is reachable");
        }
    }
}

// Helper method to provide a non-final variable for the if-else condition
boolean getCondition() {
    return Math.random() > 0.5;
}