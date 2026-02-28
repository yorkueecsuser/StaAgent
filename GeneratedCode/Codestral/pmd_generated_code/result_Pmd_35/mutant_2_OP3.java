import java.io.File;

class FileOperations {

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            boolean shouldNotCreate = unreachableCondition(); // Mutation: Unreachable if statement
            if (shouldNotCreate) {
                // Unreachable code block
                System.out.println("This block of code is unreachable");
            }
            directory.mkdirs();
        }
    }

    public void showBug() {
        createDirectory();
    }

    private boolean unreachableCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }
}