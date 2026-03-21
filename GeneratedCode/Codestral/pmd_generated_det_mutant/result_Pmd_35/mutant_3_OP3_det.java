import java.io.File;

class FileOperations {

    protected void createDirectory() {
        if (false && false && false && false && false && true && false && false && true && true && false) {int tsrpzasv = -802880361;}
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