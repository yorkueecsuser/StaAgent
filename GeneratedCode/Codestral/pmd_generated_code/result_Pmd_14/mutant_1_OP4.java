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
            // Unreachable if-else branch
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // This code block won't be executed as the condition is always false
                System.out.println("This is unreachable code.");
            } else {
                // Empty else block
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the condition unreachable
        return false;
    }
}