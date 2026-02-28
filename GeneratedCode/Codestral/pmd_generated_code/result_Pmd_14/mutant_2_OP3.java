import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (ee instanceof IOException) { // Original code
                cleanup();
            }
            if (!getCondition()) { // Mutant code: Unreachable if statement
                System.out.println("This line should not be executed.");
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }

    private boolean getCondition() {
        // Replace with your own condition that is always false
        return false;
    }
}