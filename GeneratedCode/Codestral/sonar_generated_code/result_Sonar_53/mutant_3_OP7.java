import java.io.*;

class BugExample {
    int f(int x) throws IOException {
        throw new IOException();
    }

    int g(int x) throws IOException {
        throw new IOException();
    }

    public void showBug() throws IOException {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable since the condition is always false
        }
        g(f(1));
    }

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