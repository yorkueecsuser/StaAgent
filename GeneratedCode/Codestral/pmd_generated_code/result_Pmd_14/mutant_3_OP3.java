import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                cleanup();
            }

            // Added unreachable if statement
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // this block of code is unreachable
                System.out.println("This line should never be printed.");
            }
        }
    }

    private boolean getUnreachableCondition() {
        // this method always returns false
        return false;
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}