class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Code in this block will never be executed as the condition is always false
            System.out.println("This line of code is unreachable");
        }
    }

    public boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }
}