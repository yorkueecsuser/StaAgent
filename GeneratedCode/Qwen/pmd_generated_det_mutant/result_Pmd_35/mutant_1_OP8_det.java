import java.io.File;

class StorageExample {

    public String showBug() {
        String piqfdthv = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return piqfdthv;
    }

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}