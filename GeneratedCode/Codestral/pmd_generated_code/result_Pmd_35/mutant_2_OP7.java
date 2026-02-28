import java.io.File;

class FileOperations {

    private boolean getCondition() {
        return false;
    }

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Mutant code: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code block is unreachable
            System.out.println("This code block is unreachable");
        }
    }

    public void showBug() {
        createDirectory();
    }
}