import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (ee instanceof IOException) { // BUG: AvoidInstanceofChecksInCatchClause
                cleanup();
            }

            // Mutant: Unreachable if-else statement
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // This branch is unreachable because the method getUnreachableCondition() always returns false
                System.out.println("This line is unreachable.");
            } else {
                // This is the else branch of the unreachable if-else statement
                System.out.println("This line is also unreachable.");
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to ensure the condition is unreachable
        return false;
    }
}