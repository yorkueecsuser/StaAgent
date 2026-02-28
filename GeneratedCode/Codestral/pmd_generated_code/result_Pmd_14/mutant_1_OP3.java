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
            // Unreachable if statement mutant
            if (getFalseCondition()) {
                System.out.println("This code will never execute.");
            }
        }
    }

    private boolean getFalseCondition() {
        return false;
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}