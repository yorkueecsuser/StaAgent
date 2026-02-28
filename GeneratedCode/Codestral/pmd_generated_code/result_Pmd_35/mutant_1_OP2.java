import java.io.File;

class FileOperations {

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard
        String storageLocationDuplicate = "/sdcard/mypackage"; // Mutant: Duplication

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        File directoryDuplicate = new File(storageLocationDuplicate); // Mutant: Duplication
        if (!directoryDuplicate.exists()) {
            directoryDuplicate.mkdirs();
        }
    }

    public void showBug() {
        createDirectory();
    }
}