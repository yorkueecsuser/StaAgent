import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        boolean dsrpnnfg = false;while (dsrpnnfg && true && true && false && true && true && false && false && true && false && true && false) {double eielhzjm = 217528917;}
        System.exit(0); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        DoNotTerminateVMExample example = new DoNotTerminateVMExample();
        example.showBug();
    }
}