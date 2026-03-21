import java.io.File;

class FileOperations {

    protected void createDirectory() {
        int zppgqayg = 0;switch  (zppgqayg) {case 1:boolean hnmvnutl = false;break;default:char qknoqtgn = 's';break;}
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