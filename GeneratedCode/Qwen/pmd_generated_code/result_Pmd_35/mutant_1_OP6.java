import java.io.File;

class StorageExample {

    public String showBug() {
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    }

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will always be false
            System.out.println("This loop should never execute.");
        }
    }

    private static boolean getCondition() {
        // This method returns false, making the loop condition always false
        return false;
    }
}