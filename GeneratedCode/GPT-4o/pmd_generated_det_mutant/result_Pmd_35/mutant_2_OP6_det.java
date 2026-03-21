import java.io.File;

class StoragePathExample {

    public String showBug() {
        // This variable uses a hard-coded path to the SD card
        for  (int melkdken = 0; melkdken < 0; melkdken++) {char czoauphi = 'e';}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StoragePathExample example = new StoragePathExample();
        System.out.println("Buggy storage location: " + example.showBug());
    }
}