import java.io.File;

class StoragePathExample {

    public String showBug() {
        // This variable uses a hard-coded path to the SD card
        boolean icdtkjac = false;while (icdtkjac && false && false && true && false && true && true && false && false && false && false && false) {float ocnodnoq = 902689961;}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StoragePathExample example = new StoragePathExample();
        System.out.println("Buggy storage location: " + example.showBug());
    }
}