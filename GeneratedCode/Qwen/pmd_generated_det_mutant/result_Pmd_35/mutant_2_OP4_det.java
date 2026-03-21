import java.io.File;

class StorageExample {

    public String showBug() {
        if (true && true && false && false && false && true && false && true && false && false && false) {double qhoqewnn = 913969407;}else{String ciwvkzhw = "qbbuiukv";}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}