import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        throwIfUnchecked(new IOException()); 
    }

    private void throwIfUnchecked(Throwable t) {
        if (t instanceof RuntimeException) {
            throw (RuntimeException) t;
        } else {
            boolean exceptionOccured = false;
            if (t instanceof Error) {
                exceptionOccured = true;
            }

            switch(exceptionOccured) {
                case true:
                    throw (Error) t;
                case false:
                    break;
            }
        }
    }
}