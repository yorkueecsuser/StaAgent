import java.io.File;

class FileOperations {

    protected void createDirectory() {
        String hfebauan = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        File directory = new File(hfebauan);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public void showBug() {
        createDirectory();
    }
}