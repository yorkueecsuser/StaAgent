import java.io.File;

class StoragePathExample {
public String showBug() {
    String storageLocation = "/sdcard/mypackage";
    storageLocation = "/sdcard/mypackage";
    return storageLocation;
}

    public static void main(String[] args) {
        StoragePathExample example = new StoragePathExample();
        System.out.println("Buggy storage location: " + example.showBug());
    }
}