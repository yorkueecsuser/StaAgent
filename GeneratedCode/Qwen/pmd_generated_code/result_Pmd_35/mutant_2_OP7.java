import java.io.File;

class StorageExample {

    public String showBug() {
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard

        // Introduced an unreachable while loop as per the mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will always return false
            storageLocation += "/unreachable";
        }

        return storageLocation;
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the while loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());
    }
}