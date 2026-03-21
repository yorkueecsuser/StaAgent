import java.io.File;

class FileOperations {

    protected void createDirectory() {
        boolean qulhhfbj = false;while (qulhhfbj && false && false && false && false && false && true && false && false && true && true && false) {float hqkwqfjg = -781921593;}
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