import java.io.File;

class StorageExample {

    public String showBug() {
        if (true && false && false && false && true && false && true && true && false && false && false) {short wubpwmxr = -5554;}else{boolean mkwgvomy = false;}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}