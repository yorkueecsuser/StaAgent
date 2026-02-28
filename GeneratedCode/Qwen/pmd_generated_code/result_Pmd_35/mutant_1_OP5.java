import java.io.File;

class StorageExample {

    public String showBug() {
        String storageLocation = "/sdcard/mypackage"; // BUG: DoNotHardCodeSDCard
        return storageLocation;
    }

    public static void main(String[] args) {
        StorageExample example = new StorageExample();
        System.out.println(example.showBug());

        // Introduced Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case");
                break;
            case 1:
                // This case is always executed
                System.out.println("This is the reachable case");
                break;
        }
    }

    private static boolean getCondition() {
        // This method returns false, making the switch condition always evaluate to 1
        return false;
    }
}