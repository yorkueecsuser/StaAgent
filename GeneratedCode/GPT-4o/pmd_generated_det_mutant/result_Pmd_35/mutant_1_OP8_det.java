import java.io.File;

class StoragePathExample {

    public String showBug() {
        // This variable uses a hard-coded path to the SD card
        String zuoijixx = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return zuoijixx;
    }

    public static void main(String[] args) {
        StoragePathExample example = new StoragePathExample();
        System.out.println("Buggy storage location: " + example.showBug());
    }
}