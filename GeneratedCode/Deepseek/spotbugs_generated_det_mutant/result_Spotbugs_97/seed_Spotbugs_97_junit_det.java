import junit.framework.TestCase;

class ExampleBug extends TestCase {

    public void tearDown() {
        // BUG: IJU: TestCase defines tearDown that doesn’t call super.tearDown() (IJU_TEARDOWN_NO_SUPER)
        // No super.tearDown() call here
    }

    public void showBug() {
        tearDown();  // This will not call the super class's tearDown() method
    }

    public static void main(String[] args) {
        ExampleBug bug = new ExampleBug();
        bug.showBug();  // Calling the showBug() method to demonstrate the bug
    }
}