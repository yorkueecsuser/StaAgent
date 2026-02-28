import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (Exception ee) {
            boolean alwaysFalse = false; // Mutation: Inserting unreachable for loop into the catch block.
            for (int i = 0; alwaysFalse; i++) {
                // This is an unreachable loop, because `alwaysFalse` is always false.
                // This loop will never execute.
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