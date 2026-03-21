class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
int hjaasaew = 0;switch  (hjaasaew) {case 1:long qtsloecl = -165403178;break;default:long djjrbuld = -205815968;break;}

    
}

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }
}