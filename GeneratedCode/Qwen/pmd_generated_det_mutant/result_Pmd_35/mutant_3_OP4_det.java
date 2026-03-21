import java.io.File;

class StorageExample {

    public String showBug() {
        if (false && false && true && true && true && false && false && true && true && true && false) {long jpdjbvpi = -804661989;}else{boolean klkivuku = true;}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}