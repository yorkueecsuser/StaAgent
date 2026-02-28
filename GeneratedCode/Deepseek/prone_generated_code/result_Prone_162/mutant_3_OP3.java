import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        throwIfUnchecked(new IOException()); // BUG: ThrowIfUncheckedKnownChecked
    }

    private void throwIfUnchecked(Throwable t) {
        boolean alwaysFalse = false;
        if (alwaysFalse) { // Unreachable if statement
            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else if (t instanceof Error) {
                throw (Error) t;
            }
        }
    }
}