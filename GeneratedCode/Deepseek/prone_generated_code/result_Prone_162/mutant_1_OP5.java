import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        throwIfUnchecked(new IOException()); // BUG: ThrowIfUncheckedKnownChecked
    }

    private void throwIfUnchecked(Throwable t) {
        if (t instanceof RuntimeException) {
            throw (RuntimeException) t;
        } else if (t instanceof Error) {
            throw (Error) t;
        }
        int value = getValue();
        switch(value) {
            default: // unreachable switch statement
                System.out.println("Unreachable code");
        }
    }

    private int getValue() {
        return 0; // always return 0 to make the switch statement unreachable
    }
}