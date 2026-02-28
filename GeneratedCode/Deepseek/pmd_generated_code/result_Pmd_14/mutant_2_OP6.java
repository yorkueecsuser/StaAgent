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
        }

        // Mutant: Adding unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("This is a mutant code that should not run");
        }
    }

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}