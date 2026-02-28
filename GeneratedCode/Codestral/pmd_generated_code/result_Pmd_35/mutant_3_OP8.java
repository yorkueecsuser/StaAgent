import java.io.File;

class FileOperations {

    protected void createDirectory() {
        String x = "/sdcard/mypackage";  // Mutant: Renamed variable storageLocation to x

        File directory = new File(x);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public void showBug() {
        createDirectory();
    }
}