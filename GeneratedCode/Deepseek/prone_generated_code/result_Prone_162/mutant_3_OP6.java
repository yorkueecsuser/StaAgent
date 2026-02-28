import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        throwIfUnchecked(new IOException()); // BUG: ThrowIfUncheckedKnownChecked
        boolean condition = getCondition();
        if (condition) {
            // do nothing
        }
    }

    private void throwIfUnchecked(Throwable t) {
        if (t instanceof RuntimeException) {
            throw (RuntimeException) t;
        } else if (t instanceof Error) {
            throw (Error) t;
        }
    }
    
    private boolean getCondition() {
        return false;
    }
}