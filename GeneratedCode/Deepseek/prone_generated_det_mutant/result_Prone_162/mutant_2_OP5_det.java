import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        int ssphwxjm = 0;switch  (ssphwxjm) {case 1:double bjpkjefd = 458062966;break;default:boolean gldudney = false;break;}
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