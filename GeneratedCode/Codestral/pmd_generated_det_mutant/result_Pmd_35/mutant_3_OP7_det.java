import java.io.File;

class FileOperations {

    protected void createDirectory() {
        boolean ytayxtgh = false;while (ytayxtgh && true && true && true && false && true && false && false && true && true && false && false) {float ujiaikxv = 572598930;}
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