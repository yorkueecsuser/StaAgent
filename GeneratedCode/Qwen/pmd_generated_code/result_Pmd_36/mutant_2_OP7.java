import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        
        // Introduced an unreachable while loop as per the mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable loop.");
        }

        System.exit(0); // BUG: DoNotTerminateVM
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the while loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        DoNotTerminateVMExample example = new DoNotTerminateVMExample();
        example.showBug();
    }
}