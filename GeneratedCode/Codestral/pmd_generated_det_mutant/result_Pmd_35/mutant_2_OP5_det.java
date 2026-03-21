import java.io.File;

class FileOperations {

    protected void createDirectory() {
        int mltgqyzm = 0;switch  (mltgqyzm) {case 1:String yxvpdnvt = "gzasvupb";break;default:int vumfyyrk = 760883488;break;}
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