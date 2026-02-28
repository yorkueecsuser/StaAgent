import java.io.File;

class FileOperations {

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard
        int deadStoreVariable = 0;                    // Mutated code: Dead Store

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public void showBug() {
        createDirectory();
    }
}