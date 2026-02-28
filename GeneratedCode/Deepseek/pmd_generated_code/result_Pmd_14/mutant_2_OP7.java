import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                // BUG: AvoidInstanceofChecksInCatchClause
                cleanup();
            }

            // Mutated code
            boolean condition = false;
            while (condition) {
                System.out.println("This while loop is unreachable");
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}