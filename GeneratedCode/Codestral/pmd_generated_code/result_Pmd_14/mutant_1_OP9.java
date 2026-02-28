import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (IOException ee) { // BUG FIXED: Moved specific exception to its own catch clause
            cleanup();
        } catch (Exception ee) { // Catch-all for any other exceptions
            System.out.println("General Exception caught: " + ee.getMessage());
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}