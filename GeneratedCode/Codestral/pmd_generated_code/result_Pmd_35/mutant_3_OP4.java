import java.io.File;

class FileOperations {

    protected boolean getUnreachableCondition() {
        return false; // This condition is always false, making the if-else branch unreachable.
    }

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Mutant
        if (getUnreachableCondition()) {
            System.out.println("This line will never execute.");
        } else {
            System.out.println("This line is part of the unreachable branch.");
        }
    }

    public void showBug() {
        createDirectory();
    }
}