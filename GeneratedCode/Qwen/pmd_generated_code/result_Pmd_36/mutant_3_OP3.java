import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
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