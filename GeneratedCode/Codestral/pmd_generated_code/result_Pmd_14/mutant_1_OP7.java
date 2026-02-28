import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                boolean conditionWhile = getCondition();
                while (conditionWhile) {
                    // This loop is unreachable as conditionWhile is always false
                }
                cleanup();
            }
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false making the loop unreachable
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}