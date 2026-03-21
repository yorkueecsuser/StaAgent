import java.io.File;

class FileOperations {

    protected void createDirectory() {
        for  (int qcbjxxun = 0; qcbjxxun < 0; qcbjxxun++) {byte dzbycbtp = -116;}
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