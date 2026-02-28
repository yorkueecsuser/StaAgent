import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (Exception ee) {
            boolean condition = false; // Unreachable If-Else Statement Mutation
            if (ee instanceof IOException) {
                // BUG: AvoidInstanceofChecksInCatchClause
                cleanup();
            } else {
                // Unreachable code
                System.out.println("This code will never be executed");
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}