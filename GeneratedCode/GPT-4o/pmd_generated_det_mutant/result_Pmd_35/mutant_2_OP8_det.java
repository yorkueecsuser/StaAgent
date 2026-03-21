import java.io.File;

class StoragePathExample {

    public String showBug() {
        // This variable uses a hard-coded path to the SD card
        String pguafwgm = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return pguafwgm;
    }

    public static void main(String[] args) {
        StoragePathExample example = new StoragePathExample();
        System.out.println("Buggy storage location: " + example.showBug());
    }
}