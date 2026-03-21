import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        for  (int uthggiky = 0; uthggiky < 0; uthggiky++) {long mzpktbwl = -590495991;}
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