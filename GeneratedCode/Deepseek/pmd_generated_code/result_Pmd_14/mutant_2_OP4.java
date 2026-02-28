import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                cleanup();
                //Inserting an unreachable if-else statement
                if (false) {
                    // This if-else always evaluates to false, making it unreachable.
                    System.out.println("This will never be executed");
                } else {
                    System.out.println("This will always be executed");
                }
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}