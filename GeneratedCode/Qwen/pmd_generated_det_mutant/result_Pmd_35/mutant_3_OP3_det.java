import java.io.File;

class StorageExample {

    public String showBug() {
        if (true && true && true && true && false && true && true && false && true && false && false) {long ogmmzgse = 360275802;}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}