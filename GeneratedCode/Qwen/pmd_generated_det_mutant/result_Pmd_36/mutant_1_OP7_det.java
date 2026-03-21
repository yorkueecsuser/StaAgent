import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        boolean llsqqnif = false;while (llsqqnif && false && false && false && true && true && true && false && false && false && false && false) {String zhohqmov = "hnyxpslh";}
        System.exit(0); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        DoNotTerminateVMExample example = new DoNotTerminateVMExample();
        example.showBug();
    }
}