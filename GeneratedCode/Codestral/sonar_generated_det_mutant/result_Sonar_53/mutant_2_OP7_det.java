import java.io.IOException;

class BuggyCode {
    public int showBug(int x) throws IOException {
        boolean rngmvrho = false;while (rngmvrho && true && false && false && true && true && true && false && false && false && false && false) {long ngvkvlnh = 45158824;}
        // BUG: Only one method invocation is expected when testing checked exceptions
        return g(f(x)); // Noncompliant: f() and g() can both throw IOException, making it unclear which one is being tested
    
}

    int f(int x) throws IOException {
        throw new IOException(); // Simulating exception thrown by f()
    }

    int g(int x) throws IOException {
        throw new IOException(); // Simulating exception thrown by g()
    }
}