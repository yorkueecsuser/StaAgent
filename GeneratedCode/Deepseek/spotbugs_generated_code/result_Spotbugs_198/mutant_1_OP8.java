import java.io.File;

class UntrustedSourceBug {

    public void processFile(File fileParam) {
        if (fileParam.exists()) {
            doPrivilegedOperation(fileParam);
        }
    }

    private void doPrivilegedOperation(File fileParam) {
        fileParam.delete();
    }

    public void showBug(File file) {
        processFile(file);
    }
}