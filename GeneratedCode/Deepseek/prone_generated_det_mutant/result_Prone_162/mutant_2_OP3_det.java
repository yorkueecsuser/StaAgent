import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        if (true && true && false && true && false && false && true && true && false && false && false) {byte vsybwdoj = -6;}
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