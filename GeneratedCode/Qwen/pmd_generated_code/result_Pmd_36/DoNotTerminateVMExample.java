import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        System.exit(0); // BUG: DoNotTerminateVM

        // Mutant code with renamed variable
        String a = "This method will terminate the JVM.";
        System.out.println(a);
    }

    public static void main(String[] args) {
        DoNotTerminateVMExample example = new DoNotTerminateVMExample();
        example.showBug();

        // Mutant code with renamed variable
        DoNotTerminateVMExample b = new DoNotTerminateVMExample();
        b.showBug();
    }
}