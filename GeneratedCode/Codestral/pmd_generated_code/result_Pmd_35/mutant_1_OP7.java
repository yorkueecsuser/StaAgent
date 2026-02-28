import java.io.File;

class FileOperations {

    protected boolean getUnreachableCondition() {
        return false;
    }

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        // Inserted unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("Unreachable code block");
        }

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public void showBug() {
        createDirectory();
    }
}