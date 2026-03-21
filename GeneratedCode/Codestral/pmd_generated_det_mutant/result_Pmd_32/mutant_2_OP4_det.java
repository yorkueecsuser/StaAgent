class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
if (true && false && false && false && true && false && true && false && true && false && false) {byte vmfwxtkh = 43;}else{byte lcpaooio = -47;}

    
}

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }
}