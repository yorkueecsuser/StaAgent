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
    
    private void throwIfUnchecked2(Throwable t1) { // Renamed variable from throwIfUnchecked to throwIfUnchecked2
        if (t1 instanceof RuntimeException) {
            throw (RuntimeException) t1;
        } else if (t1 instanceof Error) {
            throw (Error) t1;
        }
    }
}