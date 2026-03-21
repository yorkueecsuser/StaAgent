import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        if (false && true && true && true && false && true && true && false && false && false && false) {float ftqjnygd = -876151262;}
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