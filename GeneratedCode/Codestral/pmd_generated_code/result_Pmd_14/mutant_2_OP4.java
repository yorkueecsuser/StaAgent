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
            // Mutant code added: Unreachable if-else statement
            if (getCondition()) {
                // This block is unreachable
                System.out.println("This code is unreachable.");
            } else {
                System.out.println("This code is also unreachable.");
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }

    private boolean getCondition() {
        // This method always returns false to make the if-else statement unreachable
        return false;
    }
}