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

    private boolean getCondition() {
        return false;
    }

    public void showBug() throws IOException {
        // Noncompliant: Both f() and g() can throw an IOException, but we're not sure which one
        int result = f(1);
        // Added unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            switch(result) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code executed.");
                    break;
            }
        }
        g(result); // BUG: Only one method invocation is expected when testing checked exceptions
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