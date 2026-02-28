import java.io.File;

class FileOperations {

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        // Inserted unreachable for loop
        boolean loopCondition = getLoopCondition();
        for (int i = 0; loopCondition; i++) {
            // This code will never execute
        }

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    // Dummy method to return the loop condition
    private boolean getLoopCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public void showBug() {
        createDirectory();
    }
}