import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        if (false && false && true && true && false && true && false && true && false && false && false) {boolean geziggzl = true;}else{boolean rzxicvfe = false;}
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