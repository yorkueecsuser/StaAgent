class MyClass {
    // BUG: DetachedTestCase
    public void someMethod() {
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        boolean condition = getCondition();
        while (condition) { // Mutant: Unreachable while loop
            // This loop is unreachable as the condition is always false
        }
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }

    private boolean getCondition() {
        return false; // This method ensures that the condition is dynamically determined at runtime
    }
}