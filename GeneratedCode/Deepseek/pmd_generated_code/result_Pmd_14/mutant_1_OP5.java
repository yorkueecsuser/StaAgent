import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (Exception ee) {
            boolean unreachableCondition = getUnreachableCondition();
            if (ee instanceof IOException) {
                // Mutant Code: Unreachable Switch Statement
                switch(unreachableCondition) {
                    case 1:
                        cleanup();
                        break;
                    default:
                        // Unreachable but necessary to avoid unreachable statement error
                        break;
                }
                // END of Mutant Code
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup performed");
    }

    // Method to simulate a dynamic runtime condition
    private boolean getUnreachableCondition() {
        return false;
    }
}