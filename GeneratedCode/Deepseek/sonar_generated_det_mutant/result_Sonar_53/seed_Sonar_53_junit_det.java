import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

class BuggyCode {
    @Test
    public void testG() {
        // Do you expect g() or f() throwing the exception?
        assertThrows(IOException.class, () -> g(f(1)) ); // BUG: Only one method invocation is expected when testing checked exceptions
    }

    @Test
    public void testGTryCatchIdiom() {
        try { // BUG: Only one method invocation is expected when testing checked exceptions
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

    public static void assertThrows(Class<? extends Throwable> expected, Executable executable) {
        try {
            executable.execute();
        } catch (Throwable actual) {
            if (actual.getClass().isAssignableFrom(expected)) {
                return;
            }
            throw new AssertionError(
                    String.format("Expected: %s, but got: %s", expected.getName(), actual.getClass().getName()),
                    actual
            );
        }
        throw new AssertionError(String.format("Expected: %s, but no exception was thrown", expected.getName()));
    }

    public interface Executable {
        void execute() throws Throwable;
    }
}