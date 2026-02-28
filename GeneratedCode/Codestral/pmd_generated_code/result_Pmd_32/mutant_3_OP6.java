class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
        // Inserted mutant code: unreachable for loop
        boolean shouldRun = getCondition();
        for (int i = 0; shouldRun; i++) {
            // This code is unreachable
        }
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }

    // Method to return a false condition for the unreachable for loop
    private boolean getCondition() {
        return false;
    }
}