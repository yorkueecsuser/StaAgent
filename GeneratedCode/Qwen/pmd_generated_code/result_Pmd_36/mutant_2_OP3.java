import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable block due to the condition always being false
            System.out.println("This is an unreachable block.");
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