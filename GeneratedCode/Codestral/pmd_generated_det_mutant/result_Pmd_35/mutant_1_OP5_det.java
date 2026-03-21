import java.io.File;

class FileOperations {

    protected void createDirectory() {
        int ziycyvfj = 0;switch  (ziycyvfj) {case 1:long qfalerpx = 49624947;break;default:float lrlqcnhi = 711037884;break;}
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