import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        int epcuqxov = 0;switch  (epcuqxov) {case 1:boolean yjinahdx = true;break;default:String jxhjkkjq = "xjgcdezn";break;}
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