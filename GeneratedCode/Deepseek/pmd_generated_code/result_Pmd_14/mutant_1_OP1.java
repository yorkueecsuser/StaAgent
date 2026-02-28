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

        // Unreachable code was here, but it has been removed
        String a1b2c3d4 = ""; // Unused variable declaration
    }

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}