import java.io.File;

class FileOperations {

    private boolean getUnreachableCondition() {
        return false;
    }

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            while (getUnreachableCondition()) {
                // Unreachable while loop
                // Do nothing
            }
            directory.mkdirs();
        }
    }

    public void showBug() {
        createDirectory();
    }
}