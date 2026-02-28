import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        boolean condition = getCondition();
        if (condition) {
            // This block is intended to be unreachable
            System.out.println("This is an unreachable block.");
        } else {
            // Alternative block
            System.out.println("This is the alternative block.");
        }
        System.exit(0); // BUG: DoNotTerminateVM
    }

    private boolean getCondition() {
        // This method returns false, making the if-block unreachable
        return false;
    }

    public static void main(String[] args) {
        DoNotTerminateVMExample example = new DoNotTerminateVMExample();
        example.showBug();
    }
}