import java.io.File;

class UntrustedSourceBug {

    public void processFile(File file) {
        if (file.exists()) {
            File fileCopy = new File(file.getPath());  // Mutation: Duplicate the assignment statement
            doPrivilegedOperation(fileCopy);
        }
    }

    private void doPrivilegedOperation(File file) {
        file.delete();
    }

    public void showBug(File file) {
        processFile(file);
    }
}