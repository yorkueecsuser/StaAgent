import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;

class BugTest {

    @Test
    public void testG() {
        // Do you expect g() or f() throwing the exception?
        // BUG: Only one method invocation is expected when testing checked exceptions
        assertThrows(IOException.class, () -> g(f(1)) ); // Noncompliant
    }

    @Test
    public void testGTryCatchIdiom() {
        try { // Noncompliant
            g(f(1));
            Assert.fail("Expected an IOException to be thrown");
        } catch (IOException e) {
            // Test exception message...
        }
    }

    public void showBug() {
        try {
            g(f(1));
            Assert.fail("Expected an IOException to be thrown");
        } catch (IOException e) {
            // Test exception message...
        }
    }

    int f(int x) throws IOException {
        //...
        return 0;
    }

    int g(int x) throws IOException {
        //...
        return 0;
    }

    void assertThrows(Class<? extends Throwable> expected, Executable executable) {
        try {
            executable.execute();
            Assert.fail("Expected an IOException to be thrown");
        } catch (Throwable actualException) {
            if (!expected.isInstance(actualException)) {
                Assert.fail("Expected " + expected.getName() + " to be thrown");
            }
        }
    }

    @FunctionalInterface
    public interface Executable {
        void execute() throws IOException;
    }
}