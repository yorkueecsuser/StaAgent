import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            // Mutant Unreachable While Loop
            boolean unreachableCondition = false;
            while (unreachableCondition) {
                System.out.println("This line should never be printed.");
            }

            if (ee instanceof IOException) {
                cleanup();
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}