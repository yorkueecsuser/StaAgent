import org.junit.Test;

class ExampleTest {

    @Test
    public void validTestCase() {
        // Some test logic
    }

    public void showBug() {
        // Call the buggy method
        detachedTestCase();
    }

    // BUG: DetachedTestCase
    public void detachedTestCase() {
        // This method looks like a test case but is missing the @Test annotation
        // and should either be private or annotated with @Test and potentially @Ignore if needed
        System.out.println("This method should be a test but isn't annotated.");
    }
}