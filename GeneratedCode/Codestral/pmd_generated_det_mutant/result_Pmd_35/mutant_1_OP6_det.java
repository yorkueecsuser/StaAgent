import java.io.File;

class FileOperations {

    protected void createDirectory() {
        for  (int fmycoelv = 0; fmycoelv < 0; fmycoelv++) {long pvtrurwf = -13757309;}
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