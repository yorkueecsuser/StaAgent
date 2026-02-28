import java.io.File;

class FileOperations {

    // Method to check if a condition is false (to simulate an unreachable if statement)
    private boolean getUnreachableCondition() {
        return false;
    }

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Adding an unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This line will never be executed.");
        }
    }

    public void showBug() {
        createDirectory();
    }
}