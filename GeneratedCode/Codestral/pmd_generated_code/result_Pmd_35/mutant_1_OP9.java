import java.io.File;

class FileOperations {

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public void showBug() {
        createDirectory();
    }
}