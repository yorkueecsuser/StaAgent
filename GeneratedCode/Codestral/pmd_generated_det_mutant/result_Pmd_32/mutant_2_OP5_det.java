class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
int yefmfqir = 0;switch  (yefmfqir) {case 1:byte mmmddfnz = -87;break;default:byte lgpmztzs = 58;break;}

    
}

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }
}