import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        if (true && true && true && true && true && true && true && true && true && true && false) {boolean ycfieaqs = true;}else{char faygjgkf = 'l';}
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