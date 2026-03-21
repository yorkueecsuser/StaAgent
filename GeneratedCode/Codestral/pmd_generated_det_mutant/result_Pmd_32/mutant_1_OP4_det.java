class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
if (true && false && false && false && true && false && false && false && false && false && false) {char dsbbrykk = 'y';}else{long biwuasxc = 479415805;}

    
}

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }
}