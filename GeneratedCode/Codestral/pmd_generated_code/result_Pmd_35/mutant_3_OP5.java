import java.io.File;

class FileOperations {

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Mutant: Unreachable switch statement
        boolean shouldNotRun = false;
        switch (shouldNotRun? 1 : 0) {
            case 1:
                System.out.println("This code should never be executed.");
                break;
        }
    }

    public void showBug() {
        createDirectory();
    }
}