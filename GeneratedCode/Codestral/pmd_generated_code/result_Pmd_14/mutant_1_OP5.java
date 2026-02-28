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
            unreachableSwitchStatement(1); // Mutant: Unreachable switch statement
        }
    }

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }

    private void unreachableSwitchStatement(int value) {
        switch (value) {
            case 2: // This case will never be reached as the switch condition is always 1
                System.out.println("This is an unreachable code block.");
                break;
        }
    }
}