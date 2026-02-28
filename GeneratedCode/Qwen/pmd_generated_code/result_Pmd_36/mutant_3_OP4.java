import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        boolean condition = getCondition();
        if (condition) {
            // This block will never be executed because getCondition() returns false
            System.out.println("This is an unreachable if block.");
        } else {
            // This block will also never be executed because getCondition() returns false
            System.out.println("This is an unreachable else block.");
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