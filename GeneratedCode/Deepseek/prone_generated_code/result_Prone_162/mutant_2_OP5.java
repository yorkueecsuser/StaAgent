import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        throwIfUnchecked(new IOException()); // BUG: ThrowIfUncheckedKnownChecked
        boolean condition = getCondition(); // Added unreachable part
        if (condition) {
            switch (0) { // Added unreachable switch statement
                case 1:
                    System.out.println("Unreachable switch statement");
                    break;
            }
        }
    }

    private void throwIfUnchecked(Throwable t) {
        if (t instanceof RuntimeException) {
            throw (RuntimeException) t;
        } else if (t instanceof Error) {
            throw (Error) t;
        }
    }

    private boolean getCondition() {
        return false; // Dummy code to make the condition false
    }
}