import java.io.File;

class StorageExample {

    public String showBug() {
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard

        // Inserting unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            storageLocation = "/sdcard/otherpackage"; // This line is unreachable
        } else {
            storageLocation = "/sdcard/yetanotherpackage"; // This line is also unreachable
        }

        return storageLocation;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}