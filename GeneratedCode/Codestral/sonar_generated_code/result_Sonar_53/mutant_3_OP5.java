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
        g(f(1));

        boolean condition = getCondition();
        if (condition) {
            int value = 0;
            switch (value) {
                case 1:
                    // This case is unreachable because value is always 0
                    System.out.println("This line should never be executed");
                    break;
            }
        }
    }

    public boolean getCondition() {
        return false; // This ensures the if block is never executed
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