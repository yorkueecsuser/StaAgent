import org.junit.Test;

class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.

        // Mutant: Dead Store
        int deadStoreVariable = 10; // <-- Adding an unused variable declaration
    }
}