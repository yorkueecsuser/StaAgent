import java.io.*;

class BugExample {
    int f(int x) throws IOException {
        throw new IOException();
    }

    int g(int x) throws IOException {
        throw new IOException();
    }

    public void showBug() throws IOException {
        // Inserted mutant: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code is unreachable as the condition is always false
        }

        g(f(1));
    }

    // Method to always return false for the condition
    private boolean getCondition() {
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