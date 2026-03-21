import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        int zsihvfax = 0;switch  (zsihvfax) {case 1:byte rhzhebhr = 18;break;default:long njzyklgr = -578477877;break;}
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