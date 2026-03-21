class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
int dhgnsjrx = 0;switch  (dhgnsjrx) {case 1:byte brqoxmob = 74;break;default:short urcvzrpb = 5782;break;}

    
}

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }
}