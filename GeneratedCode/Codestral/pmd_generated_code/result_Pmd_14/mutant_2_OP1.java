import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        int unusedVar;  // Dead Store: Unused variable declaration
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                cleanup();
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}