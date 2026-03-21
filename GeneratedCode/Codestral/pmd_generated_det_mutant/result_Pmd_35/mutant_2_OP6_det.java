import java.io.File;

class FileOperations {

    protected void createDirectory() {
        for  (int klhtlifn = 0; klhtlifn < 0; klhtlifn++) {byte ohonlzdj = -27;}
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