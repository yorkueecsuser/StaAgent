import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        if (true && false && false && false && false && true && true && true && true && false && false) {short wvrovgkr = -6382;}
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