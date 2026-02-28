class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
        boolean condition = getCondition();
        if (condition) {
            // The original code remains unchanged.
        }

        // Mutant code: Unreachable if statement
        if (!getCondition()) { // This condition is always false to make the branch unreachable.
            System.out.println("This is an unreachable statement.");
        }
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }

    // This is a helper method to simulate a dynamic condition.
    private boolean getCondition() {
        return false;
    }
}