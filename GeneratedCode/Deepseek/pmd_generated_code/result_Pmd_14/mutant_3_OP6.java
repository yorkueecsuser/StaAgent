import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (Exception ee) {
            boolean shouldRun = false;
            if (ee instanceof IOException) {
                shouldRun = true;
            }
            for (int i = 0; shouldRun; i++) {
                // This loop is unreachable
            }
            cleanup();
        }
    }

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}