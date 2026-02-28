import java.util.Date;

class DoNotTerminateVMExample {

    public void showBug() {
        System.out.println("This method will terminate the JVM.");
        
        // Introduced an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                System.out.println("Unreachable case 0");
                break;
            case 1:
                // This case is always executed
                System.out.println("Reachable case 1");
                break;
        }

        System.exit(0); // BUG: DoNotTerminateVM
    }

    private boolean getCondition() {
        // This method returns false, making the switch condition always evaluate to 1
        return false;
    }

    public static void main(String[] args) {
        DoNotTerminateVMExample example = new DoNotTerminateVMExample();
        example.showBug();
    }
}