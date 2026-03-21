class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
for  (int hzwfqruy = 0; hzwfqruy < 0; hzwfqruy++) {boolean iknlrdqt = false;}

    
}

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }
}