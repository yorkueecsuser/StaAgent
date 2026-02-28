class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.

        // Mutant code added:
        MyClass m = new MyClass();
        m.someMethod(); // This is a mutant test case that will not be recognized by JUnit.
    }
}