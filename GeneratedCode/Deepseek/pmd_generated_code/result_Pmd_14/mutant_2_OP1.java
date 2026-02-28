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
            String unused1 = "unused";  // Dead Store Mutation Operator
        }
    }

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}