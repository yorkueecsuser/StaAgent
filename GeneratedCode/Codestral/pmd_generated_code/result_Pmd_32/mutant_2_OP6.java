class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop mutant
            System.out.println("This is an unreachable loop");
        }
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop condition unreachable
    }
}