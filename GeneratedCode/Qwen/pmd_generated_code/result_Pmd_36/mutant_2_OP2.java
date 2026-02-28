import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        int dummy = 42; // Introduced a simple assignment
        int dummy = 42; // Duplicate of the above assignment

        System.out.println("This method will terminate the JVM.");
        System.out.println("This method will terminate the JVM."); // Duplicate of the println statement for demonstration

        System.exit(0); // BUG: DoNotTerminateVM
    }

    public static void main(String[] args) {
        DoNotTerminateVMExample example = new DoNotTerminateVMExample();
        example.showBug();
    }
}