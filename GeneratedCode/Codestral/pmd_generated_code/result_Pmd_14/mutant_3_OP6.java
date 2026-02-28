import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (ee instanceof IOException) { // BUG: AvoidInstanceofChecksInCatchClause
                // Inserting unreachable for loop
                for (int i = 0;!isConditionMet(); i++) {
                    // Unreachable code
                    System.out.println("This code is unreachable.");
                }
                cleanup();
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }

    private boolean isConditionMet() {
        return false; // Condition is always false to make the loop unreachable
    }
}