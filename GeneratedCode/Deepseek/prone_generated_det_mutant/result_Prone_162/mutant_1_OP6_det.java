import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        for  (int slxaieym = 0; slxaieym < 0; slxaieym++) {int lxqtftkl = 252826074;}
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