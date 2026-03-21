import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        for  (int ftanvojz = 0; ftanvojz < 0; ftanvojz++) {char cwrmcnym = 'w';}
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