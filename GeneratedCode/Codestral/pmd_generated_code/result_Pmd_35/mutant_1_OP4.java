import java.io.File;

class FileOperations {

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();
            if (shouldNotRun()) { // Unreachable if-else statement
                // This code will never be executed
                System.out.println("This is an unreachable code block.");
            } else {
                // Alternative code block
                System.out.println("This is the alternative code block.");
            }
        }
    }

    private boolean shouldNotRun() {
        return false; // The condition for the unreachable if-else statement
    }

    public void showBug() {
        createDirectory();
    }
}