import java.io.File;

class StorageExample {

    public String showBug() {
        for  (int ibwfhwjg = 0; ibwfhwjg < 0; ibwfhwjg++) {long khcvtzvt = 166683022;}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}