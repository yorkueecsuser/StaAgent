import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                cleanup();
            }
        }
        // Mutated code starts here
        Exception ef = ee;
        if (ef instanceof IOException) {
            cleanup();
        }
        // Mutated code ends here
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}