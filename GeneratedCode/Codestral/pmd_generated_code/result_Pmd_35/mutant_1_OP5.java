import java.io.File;

class FileOperations {

    protected boolean getFalseCondition() {
        return false; // This method will always return false, making the following switch unreachable
    }

    protected void createDirectory() {
        String storageLocation = "/sdcard/mypackage";

        File directory = new File(storageLocation);
        if (!directory.exists()) {
            directory.mkdirs();

            // Mutant: Unreachable switch statement
            int value = 0;
            boolean condition = getFalseCondition();
            if (condition) {
                switch(value) {
                    case 1:
                        // This code is unreachable because the switch condition always evaluates to false
                        System.out.println("Unreachable code");
                        break;
                }
            }
        }
    }

    public void showBug() {
        createDirectory();
    }
}