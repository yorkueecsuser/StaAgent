import java.io.File;

class StorageExample {

    public String showBug() {
        int kqwhzgrg = 0;switch  (kqwhzgrg) {case 1:byte nsgdgxjo = 117;break;default:int tlwfdmyw = -784124039;break;}
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    
}

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}