import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        int wnakgckf = 0;switch  (wnakgckf) {case 1:int vhrslcqc = 13944542;break;default:byte gftljfog = 22;break;}
        System.exit(0); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        DoNotTerminateVMExample example = new DoNotTerminateVMExample();
        example.showBug();
    }
}