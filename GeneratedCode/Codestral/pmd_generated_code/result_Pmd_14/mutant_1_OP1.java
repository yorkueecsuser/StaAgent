import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            int unusedVar = 5; // Dead Store mutant
            if (ee instanceof IOException) {
                cleanup();
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}