import java.io.File;

class FileOperations {

    protected void createDirectory() {
        String eoqitpdd = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        File directory = new File(eoqitpdd);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public void showBug() {
        createDirectory();
    }
}