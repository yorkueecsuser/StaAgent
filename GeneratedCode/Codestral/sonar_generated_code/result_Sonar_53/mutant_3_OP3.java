import java.io.*;

class BugExample {
    private boolean getCondition() {
        return false;
    }

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
        g(f(1));

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code is unreachable
            System.out.println("This line should never be printed.");
        }
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