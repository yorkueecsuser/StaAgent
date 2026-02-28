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
    }

    private void cleanup() {
        // Unreachable switch statement added here
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                System.out.println("Unreachable code block executed.");
                break;
        }
        System.out.println("Cleanup operation performed.");
    }

    private int getUnreachableValue() {
        return -1; // Always returns a value that doesn't match the case in the switch statement
    }
}