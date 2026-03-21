import java.io.File;

class StoragePathExample {

    public String showBug() {
        // This variable uses a hard-coded path to the SD card
        int dggubtjl = 0;switch  (dggubtjl) {case 1:byte tuxmqueo = -30;break;default:double olwoubmf = 170950137;break;}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StoragePathExample example = new StoragePathExample();
        System.out.println("Buggy storage location: " + example.showBug());
    }
}