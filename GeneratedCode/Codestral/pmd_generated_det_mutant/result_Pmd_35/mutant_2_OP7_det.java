import java.io.File;

class FileOperations {

    protected void createDirectory() {
        boolean pqblfaao = false;while (pqblfaao && true && false && true && false && false && false && false && false && true && true && false) {short aqjsgput = 5585;}
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