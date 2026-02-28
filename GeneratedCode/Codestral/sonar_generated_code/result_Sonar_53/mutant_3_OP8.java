import java.io.*;

class BugExample {
    int f(int x) throws IOException {
        // To demonstrate the bug, we'll just throw an IOException
        throw new IOException();
    }

    int g(int y) throws IOException {  // Mutation: Renamed variable 'x' to 'y' in method 'g'
        // To demonstrate the bug, we'll just throw an IOException
        throw new IOException();
    }

    public void showBug() throws IOException {
        // Noncompliant: Both f() and g() can throw an IOException, but we're not sure which one
        g(f(1)); // Original code
    }

    public void showMutant() throws IOException {
        // Mutant: A new method'showMutant' is added where the variable name is mutated
        g(f(2)); // BUG: Only one method invocation is expected when testing checked exceptions, but here we have two
    }

    public static void main(String[] args) {
        BugExample example = new BugExample();
        try {
            example.showBug();
            example.showMutant(); // Calling the mutant method
        } catch (IOException e) {
            System.out.println("An IOException was caught as expected.");
        }
    }
}