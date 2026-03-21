import java.io.File;

class FileOperations {

    protected void createDirectory() {
        if (true && false && true && false && true && false && false && true && true && true && false) {boolean atumnyks = false;}else{short pqottxci = -7612;}
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