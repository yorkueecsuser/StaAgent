import java.io.File;

class StorageExample {

    public String showBug() {
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        String jxqfvtbn = "unusedVariable"; // Dead Store mutation
        return storageLocation;
    }

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}