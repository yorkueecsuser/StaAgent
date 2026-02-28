import java.io.*;

class BugExample {
    int f(int x) throws IOException {
        throw new IOException();
    }

    int g(int x) throws IOException {
        throw new IOException();
    }

    public void showBug() throws IOException {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) { // Mutant: Unreachable for loop
            // This loop is unreachable as the condition is always false
        }
        g(f(1));
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