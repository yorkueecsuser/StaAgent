import java.io.File;

class UntrustedSourceBug {

    public void processFile(File file) {
        File unsafeFile = file; // Renaming the variable 'file' to 'unsafeFile' to demonstrate the mutation
        if (unsafeFile.exists()) {
            doPrivilegedOperation(unsafeFile);
        }
    }

    private void doPrivilegedOperation(File unsafeFile) {
        unsafeFile.delete(); // Using the renamed variable 'unsafeFile' here
    }

    public void showBug(File file) {
        processFile(file);
    }
}