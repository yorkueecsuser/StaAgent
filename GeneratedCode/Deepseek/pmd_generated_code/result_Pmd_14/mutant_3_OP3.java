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
                if (false) {
                    // Unreachable code added by mutation
                    System.out.println("This line of code will never be executed");
                }
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}