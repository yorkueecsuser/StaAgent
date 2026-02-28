import java.util.Random;

class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.

        // Mutation: Adding a dead store
        int abcddefg = getRandomNumber();
    }

    private int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}