import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        String mutantVariable_1234abcd = "unusedVariable"; // Dead Store Mutation
        throwIfUnchecked(new IOException()); // BUG: ThrowIfUncheckedKnownChecked
    }

    private void throwIfUnchecked(Throwable t) {
        if (t instanceof RuntimeException) {
            throw (RuntimeException) t;
        } else if (t instanceof Error) {
            throw (Error) t;
        }
    }
}