import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                // AvoidInstanceofChecksInCatchClause
                cleanup();
            }
            while(false) { } // Unreachable while loop
        }
    }

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}