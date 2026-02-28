import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ex) { // Mutant: Renamed 'ee' to 'ex'
            if (ex instanceof IOException) {
                cleanup();
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}