import java.io.File;

class StorageExample {

    public String showBug() {
        boolean wqtfgtor = false;while (wqtfgtor && true && false && true && true && false && true && true && false && false && true && false) {double konzukza = 571823100;}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}