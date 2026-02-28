import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                // Mutated Code: Unreachable If Statement
                // The condition of the if statement is always false to make it unreachable
                if (false) {
                    cleanup();
                }
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}