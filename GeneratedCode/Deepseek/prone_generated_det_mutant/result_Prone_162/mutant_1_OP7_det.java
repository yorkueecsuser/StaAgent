import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        boolean yndxtoeg = false;while (yndxtoeg && true && false && true && false && false && false && false && false && false && true && false) {char vfnstwas = 'm';}
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