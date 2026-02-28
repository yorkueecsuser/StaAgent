import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        System.exit(0); // BUG: DoNotTerminateVM

        // Mutant code with renamed variable
        DoNotTerminateVMExample x = new DoNotTerminateVMExample();
        x.showBug();
    }

    public static void main(String[] args) {
        DoNotTerminateVMExample example = new DoNotTerminateVMExample();
        example.showBug();

        // Mutant code with renamed variable
        DoNotTerminateVMExample y = new DoNotTerminateVMExample();
        y.showBug();
    }
}