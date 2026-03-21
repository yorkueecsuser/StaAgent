import java.io.File;

class StorageExample {

    public String showBug() {
        String bnnrthpg = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return bnnrthpg;
    }

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}