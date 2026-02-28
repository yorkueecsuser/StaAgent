import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                boolean unreachableWhile = getCondition();
                while (unreachableWhile) {
                    // This while loop is unreachable because the condition is always false.
                    // This is added to satisfy the mutation operator.
                }
                cleanup();
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }

    private boolean getCondition() {
        return false;
    }
}