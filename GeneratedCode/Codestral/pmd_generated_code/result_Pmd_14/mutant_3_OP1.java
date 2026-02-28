import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (ee instanceof IOException) { // BUG: AvoidInstanceofChecksInCatchClause
                cleanup();
            }
            // Added Dead Store
            int xhvjqwut = 10; // Unused variable
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}