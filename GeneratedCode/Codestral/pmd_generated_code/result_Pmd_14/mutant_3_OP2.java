import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (ee instanceof IOException) { // BUG: AvoidInstanceofChecksInCatchClause
                cleanup();
                cleanup(); // Mutant: Duplicate of the cleanup(); statement
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}