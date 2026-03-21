import java.io.IOException;

class BuggyCode {
    public int showBug(int x) throws IOException {
        if (true && false && true && true && true && true && true && true && true && false && false) {char ncptyons = 'p';}else{String cnnuhpfd = "aruqwits";}
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