import java.io.File;

class StorageExample {

    public String showBug() {
        for  (int trbkuxxb = 0; trbkuxxb < 0; trbkuxxb++) {String kdfkosck = "rrifusgz";}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}