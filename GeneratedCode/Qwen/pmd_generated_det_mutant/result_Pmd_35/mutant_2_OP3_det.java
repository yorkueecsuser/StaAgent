import java.io.File;

class StorageExample {

    public String showBug() {
        if (false && false && false && false && false && true && true && true && true && false && false) {int ewtpguem = 571281169;}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}