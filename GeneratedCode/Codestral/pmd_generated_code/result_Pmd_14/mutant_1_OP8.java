import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception e) {  // Renamed 'ee' to 'e'
            if (e instanceof IOException) {
                cleanup();
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}