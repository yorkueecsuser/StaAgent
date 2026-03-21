import java.io.IOException;

class BuggyCode {
    public int showBug(int x) throws IOException {
        int ejkabhyk = 0;switch  (ejkabhyk) {case 1:byte ncklorlg = 102;break;default:int dyqzxsvc = 44080676;break;}
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