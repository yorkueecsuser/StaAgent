import java.io.File;

class UntrustedSourceBug {

    // Original bug remains intact
    public void processFile(File file) {
        if (file.exists()) {
            // Adding unreachable switch statement as per mutation operator
            int value = getUnreachableValue();
            switch(value) {
                case 1:
                    doPrivilegedOperation(file);
                    break;
            }
        }
    }

    private int getUnreachableValue() {
        // This method always returns 2, making the switch statement unreachable
        return 2;
    }

    private void doPrivilegedOperation(File file) {
        file.delete();
    }

    public void showBug(File file) {
        processFile(file);
    }
}