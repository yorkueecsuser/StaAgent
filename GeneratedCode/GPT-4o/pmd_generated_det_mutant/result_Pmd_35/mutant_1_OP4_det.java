import java.io.File;

class StoragePathExample {

    public String showBug() {
        // This variable uses a hard-coded path to the SD card
        if (false && false && false && false && true && false && true && false && false && false && false) {long tpufocbu = 251157512;}else{float wgxumusy = 238285405;}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StoragePathExample example = new StoragePathExample();
        System.out.println("Buggy storage location: " + example.showBug());
    }
}