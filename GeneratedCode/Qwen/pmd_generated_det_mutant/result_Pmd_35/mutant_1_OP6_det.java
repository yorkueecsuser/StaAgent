import java.io.File;

class StorageExample {

    public String showBug() {
        for  (int bbmsdqhx = 0; bbmsdqhx < 0; bbmsdqhx++) {int pndzgkhq = 43968284;}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}