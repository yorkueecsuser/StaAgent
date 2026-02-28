class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
        System.out.println("Original Method Called");
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
        // Mutant Code
        myClass.someMethod(); // Duplicated method call
    }
}