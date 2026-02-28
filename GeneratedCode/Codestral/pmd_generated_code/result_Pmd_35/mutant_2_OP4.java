import java.io.File;

class FileOperations {

    private boolean getUnreachableCondition() {
        return false;
    }

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This line should never be executed.");
        } else {
            // This is the reachable block
            System.out.println("Directory created successfully.");
        }
    }

    public void showBug() {
        createDirectory();
    }
}