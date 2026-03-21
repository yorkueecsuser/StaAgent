import java.io.File;

class FileOperations {

    protected void createDirectory() {
        if (false && true && false && false && false && false && true && false && true && true && false) {short brwnghpv = -8823;}
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