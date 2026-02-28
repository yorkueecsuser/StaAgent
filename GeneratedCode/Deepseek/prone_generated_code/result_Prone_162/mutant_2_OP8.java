import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        throwIfUnchecked(new IOException()); // BUG: ThrowIfUncheckedKnownChecked
    }

    private void throwIfUnchecked(Throwable t) {
        if (t instanceof RuntimeException) {
            throw (RuntimeException) t;
        } else if (t instanceof Error) {
            throw (Error) t;
        }
    }

    private void renameVariable() {
        String x = "Hello, World!";
        if (x.equals("Hello, World!")) {
            String newVar = x; // Renamed variable x to newVar
            System.out.println(newVar);
        }
    }
}