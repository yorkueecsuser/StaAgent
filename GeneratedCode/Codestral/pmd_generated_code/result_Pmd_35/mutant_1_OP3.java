import java.io.File;

class FileOperations {

    // Additional method to provide a dynamic condition for the mutant
    protected boolean getUnreachableCondition() {
        return false;
    }

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // MUTANT: Unreachable if statement
        if (getUnreachableCondition()) {
            throw new RuntimeException("This exception should never be thrown");
        }
    }

    public void showBug() {
        createDirectory();
    }
}