import java.io.File;

class FileOperations {

    protected void createDirectory() {
        if (true && true && false && true && true && true && false && true && false && false && false) {long bywgejgr = -404873338;}
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