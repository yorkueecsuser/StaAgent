class MyClass {
    // BUG: DetachedTestCase
    public void someMethod() {
        int a = 10; // Assuming this line is selected for duplication
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }
}