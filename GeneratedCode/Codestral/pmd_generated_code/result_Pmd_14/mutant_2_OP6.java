import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                boolean condition = getCondition();
                for (int i = 0; condition; i++) {  // Inserted unreachable for loop
                    System.out.println("This line will never be executed.");
                }
                cleanup();
            }
        }
    }

    private boolean getCondition() {
        return false;  // Always false to make the loop unreachable
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}