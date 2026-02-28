import java.io.File;

class StorageExample {

    public String showBug() {
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard

        // Introduced an unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                storageLocation = "/unreachable/path";
                break;
        }

        return storageLocation;
    }

    private boolean getAlwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}