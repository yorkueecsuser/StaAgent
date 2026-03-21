import java.io.File;

class FileOperations {

    protected void createDirectory() {
        String rwcahbvk = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        File directory = new File(rwcahbvk);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public void showBug() {
        createDirectory();
    }
}