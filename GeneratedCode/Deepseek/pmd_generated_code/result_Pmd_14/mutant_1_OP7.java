import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (Exception ee) {
            boolean unreachable = false;
            while(unreachable) {
                // This is a mutant for Unreachable while loop
                // The condition is always false to make it unreachable
            }
            if (ee instanceof IOException) {
                cleanup();
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}