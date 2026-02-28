import java.io.File;
import android.os.Environment;

class FileOperations {

    protected void createDirectory() {
        String storageLocation = Environment.getExternalStorageDirectory() + "/mypackage"; // Mutated line

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public void showBug() {
        createDirectory();
    }
}