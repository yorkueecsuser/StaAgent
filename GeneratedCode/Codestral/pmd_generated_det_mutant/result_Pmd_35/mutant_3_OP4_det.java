import java.io.File;

class FileOperations {

    protected void createDirectory() {
        if (true && true && true && false && true && true && true && false && false && false && false) {char shjdsmod = 'u';}else{boolean jlieubhq = false;}
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