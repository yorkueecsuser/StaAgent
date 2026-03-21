import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        for  (int tzyjicnh = 0; tzyjicnh < 0; tzyjicnh++) {float bsexjtjy = 85937036;}
        System.exit(0); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        DoNotTerminateVMExample example = new DoNotTerminateVMExample();
        example.showBug();
    }
}