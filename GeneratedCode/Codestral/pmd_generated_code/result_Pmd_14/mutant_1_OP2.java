import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                cleanup();
                cleanup(); // Mutant: Duplicated the cleanup() call
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}