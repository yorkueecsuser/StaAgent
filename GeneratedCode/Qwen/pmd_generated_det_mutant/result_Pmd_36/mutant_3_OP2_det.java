import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        System.exit(0); // BUG: DoNotTerminateVM
    }
public static void main(String [] args){
    DoNotTerminateVMExample example = new DoNotTerminateVMExample();
    example = new DoNotTerminateVMExample();
    example.showBug();
}
}