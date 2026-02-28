import java.io.IOException;
import java.util.Random;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            Random rand = new Random();
            String randomString = rand.ints(97, 123)
               .limit(8)
               .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
               .toString();
            String unusedVariable = randomString;
            throw new IOException();
        }
    }
}