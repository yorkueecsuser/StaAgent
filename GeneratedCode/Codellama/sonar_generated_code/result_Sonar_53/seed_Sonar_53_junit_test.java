import java.io.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class OnlyOneMethodInvocation {
    public static void main(String[] args) {
        try {
            testG();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testG() {
        assertThrows(IOException.class, () -> g(f(1)) ); // BUG: Only one method invocation is expected when testing checked exceptions
    }
    
    @Test
    public void testGTryCatchIdiom() {
        try {
            g(f(1));
            Assert.fail("Expected an IOException to be thrown");
        } catch (IOException e) {
            // Test exception message...
        }
    }
    
    int f(int x) throws IOException {
        //...
        return x+1;
    }
    
    int g(int x) throws IOException {
        //...
        return x+2;
    }
    
    public int showBug() {
        try {
            return testG();
        } catch (IOException e) {
            return 0;
        }
    }
}