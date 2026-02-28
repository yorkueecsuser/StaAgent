class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This is an unreachable block of code inserted due to the mutation.
            System.out.println("This line should never be executed.");
        } else {
            // Original code
        }
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }
}