class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.

        // Unreachable if-else statement mutant
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block should never execute
            System.out.println("This is unreachable code.");
        } else {
            // This is the reachable else block
            System.out.println("This is the reachable code.");
        }
    }

    // Dummy method to avoid compilation errors
    private boolean getCondition() {
        return false;
    }
}