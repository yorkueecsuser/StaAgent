import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                boolean isFalse = getCondition();
                for (int i = 0; isFalse; i++) { // Mutant code: Unreachable for loop
                    // This loop will never be executed because isFalse is always false
                    System.out.println("Unreachable code");
                }
                cleanup();
            }
        }
    }

    private boolean getCondition() {
        return false;
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}