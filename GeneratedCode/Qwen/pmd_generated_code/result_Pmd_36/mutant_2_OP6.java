import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
            System.out.println("This is an unreachable loop iteration.");
        }
        
        System.exit(0); // BUG: DoNotTerminateVM
    }

    public static void main(String[] args) {
        DoNotTerminateVMExample example = new DoNotTerminateVMExample();
        example.showBug();
    }

    private boolean getCondition() {
        return false;
    }
}