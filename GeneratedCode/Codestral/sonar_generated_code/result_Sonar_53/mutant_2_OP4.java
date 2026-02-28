import java.io.*;

class BugExample {
    int f(int x) throws IOException {
        // To demonstrate the bug, we'll just throw an IOException
        throw new IOException();
    }

    int g(int x) throws IOException {
        // To demonstrate the bug, we'll just throw an IOException
        throw new IOException();
    }

    public void showBug() throws IOException {
        // Noncompliant: Both f() and g() can throw an IOException, but we're not sure which one
        boolean shouldRun = getCondition();
        if (shouldRun) {
            g(f(1)); // BUG: Only one method invocation is expected when testing checked exceptions
        } else {
            // Unreachable if-else branch
            System.out.println("This code will never be executed.");
        }
    }

    public boolean getCondition() {
        // This method always returns false to make the if-else branch unreachable
        return false;
    }

    public static void main(String[] args) {
        BugExample example = new BugExample();
        try {
            example.showBug();
        } catch (IOException e) {
            System.out.println("An IOException was caught as expected.");
        }
    }
}