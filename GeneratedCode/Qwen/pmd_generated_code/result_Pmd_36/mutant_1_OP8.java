import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        System.exit(0); // BUG: DoNotTerminateVM

        // Mutant code with renaming
        String a = "This method will terminate the JVM.";
        System.out.println(a);
        int b = 0;
        System.exit(b);
    }

    public static void main(String[] args) {
        DoNotTerminateVMExample example = new DoNotTerminateVMExample();
        example.showBug();

        // Mutant code with renaming
        DoNotTerminateVMExample c = new DoNotTerminateVMExample();
        c.showBug();
    }
}