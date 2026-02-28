import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            // Mutation Operator: Equivalent Loop Replacement
            // Replace if statement with do-while loop
            boolean condition = ee instanceof IOException;
            do {
                cleanup();
                condition = false;
            } while (condition);
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}