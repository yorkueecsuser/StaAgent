class OverwrittenIncrementExample {

    public int showBug(int i) {
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        
        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                System.out.println("This case will never be reached.");
                break;
            default:
                // This is where execution will always go
                System.out.println("Default case, unreachable switch.");
        }

        return i;
    }

    public int showBug1(int i) {
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        
        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                System.out.println("This case will never be reached.");
                break;
            default:
                // This is where execution will always go
                System.out.println("Default case, unreachable switch.");
        }

        return i;
    }

    private int getUnreachableValue() {
        return 0; // This can be modified to dynamically evaluate to anything other than 1
    }

    public static void main(String[] args) {
        OverwrittenIncrementExample example = new OverwrittenIncrementExample();
        
        int result1 = example.showBug(5);
        System.out.println("Result of showBug: " + result1); // Expected output: 5

        int result2 = example.showBug1(5);
        System.out.println("Result of showBug1: " + result2); // Expected output: 5
    }
}