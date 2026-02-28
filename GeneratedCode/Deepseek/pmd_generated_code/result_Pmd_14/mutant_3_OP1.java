import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (Exception ee) {
            String deadVariable = "unused";
            if (ee instanceof IOException) {
                // BUG: AvoidInstanceofChecksInCatchClause
                cleanup();
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}