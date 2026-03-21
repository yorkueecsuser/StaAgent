class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
    }
public void showBug() {
    MyClass myClass = new MyClass();
    myClass = new MyClass();
    myClass.someMethod();
}
}