import java.io.File;

class FileOperations {

    protected void createDirectory() {
        if (true && true && true && false && true && true && false && false && true && true && false) {char nczsgvvs = 'a';}else{char winvehmg = 'z';}
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