import java.io.File;

class StorageExample {

    public String showBug() {
        boolean szldllyz = false;while (szldllyz && false && true && true && true && true && false && false && true && false && true && false) {boolean djbhrjch = true;}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}