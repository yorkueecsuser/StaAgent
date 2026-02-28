import java.io.File;
import java.util.UUID;

class FileOperations {

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";
        String deadStoreVariable = UUID.randomUUID().toString(); // Added a dead store variable

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public void showBug() {
        createDirectory();
    }
}