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
        boolean condition = getCondition();
        if (condition) {
            switch (f(1)) {
                case 1:
                    // This case will never be reached because f(1) always throws IOException
                    break;
            }
        }
        g(f(1)); // BUG: Only one method invocation is expected when testing checked exceptions
    }

    private boolean getCondition() {
        return false; // This makes the switch statement unreachable
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