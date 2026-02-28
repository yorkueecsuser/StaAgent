import java.io.IOException;

class BugExample {

    private boolean conditionWhile = true;
    private boolean conditionFor = true;

    public void showBug() throws IOException {
        throwIfUnchecked(new IOException()); // BUG: ThrowIfUncheckedKnownChecked
    }

    private void throwIfUnchecked(Throwable t) {
        if (t instanceof RuntimeException) {
            throw (RuntimeException) t;
        } else if (t instanceof Error) {
            throw (Error) t;
        }

        while (conditionWhile) {
            // Dummy code
            System.out.println("Dummy code within unreachable while loop");
            conditionWhile = false;
        }

        for (int i = 0; conditionFor; i++) {
            // Dummy code
            System.out.println("Dummy code within unreachable for loop");
            conditionFor = false;
        }
    }
}