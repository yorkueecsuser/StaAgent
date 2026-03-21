import java.io.File;

class StorageExample {

    public String showBug() {
        int vyjkmcef = 0;switch  (vyjkmcef) {case 1:byte vpcuoiip = -82;break;default:boolean vhyzxptu = false;break;}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}