import java.io.File;

class FileOperations {

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";  // BUG: DoNotHardCodeSDCard

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();

            // Unreachable switch statement mutant
            boolean condition = false;
            int switchValue = getValue();
            if (condition) {
                switch (switchValue) {
                    case 1:
                        // Unreachable code
                        System.out.println("This code should not be executed.");
                        break;
                }
            }
        }
    }

    public void showBug() {
        createDirectory();
    }

    // Method to dynamically determine the switch value
    private int getValue() {
        return 0;
    }
}