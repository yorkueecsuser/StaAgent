import org.junit.Test;

class BuggyTest {
    public void showBug() {
        System.out.println("This is a test method");
    }

    @Test
    public void anotherTestMethod() {
        System.out.println("This is another test method");
    }
}