import java.io.File;

class StorageExample {

    public String showBug() {
        if (true && true && false && false && true && false && false && false && true && false && false) {double jsgpxgnw = 38263580;}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}