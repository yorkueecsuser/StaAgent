import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will execute if shouldRun is true
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable because shouldRun is always false
            System.exit(0);
        }
        System.exit(0); // BUG: DoNotTerminateVM
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DoNotTerminateVMExample example = new DoNotTerminateVMExample();
        example.showBug();
    }
}