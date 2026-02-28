import java.io.File;

class FileOperations {

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Mutant code added - duplicate the assignment statement
        String duplicateStorageLocation = "/sdcard/mypackage";
        File duplicateDirectory = new File(duplicateStorageLocation);
        if (!duplicateDirectory.exists()) {
            duplicateDirectory.mkdirs();
        }
    }

    public void showBug() {
        createDirectory();
    }
}