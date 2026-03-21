import java.io.File;

class StorageExample {

    public String showBug() {
        int rnqgpwdj = 0;switch  (rnqgpwdj) {case 1:String yqjkgzrk = "ptwtctuf";break;default:byte npvqjzcg = 85;break;}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}