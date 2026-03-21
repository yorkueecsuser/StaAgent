import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        int vtvqjsrk = 0;switch  (vtvqjsrk) {case 1:boolean vubcwzqc = false;break;default:String kzanlsoj = "qzsaxnmc";break;}
        System.exit(0); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        DoNotTerminateVMExample example = new DoNotTerminateVMExample();
        example.showBug();
    }
}