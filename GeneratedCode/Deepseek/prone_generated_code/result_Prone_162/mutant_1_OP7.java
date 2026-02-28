import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        throwIfUnchecked(new IOException()); // Now contains an unreachable while loop
    }

    private void throwIfUnchecked(Throwable t) {
        if (t instanceof RuntimeException) {
            throw (RuntimeException) t;
        } else if (t instanceof Error) {
            throw (Error) t;
        }

        boolean conditionWhile = true; // Inserted unreachable while loop
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This code will never be executed");
        }
    }
}