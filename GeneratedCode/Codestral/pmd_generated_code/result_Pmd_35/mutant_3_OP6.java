import java.io.File;

class FileOperations {

    protected boolean getFalseCondition() {
        return false;
    }

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {   // Unreachable for loop mutant
            System.out.println("This loop will never execute");
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